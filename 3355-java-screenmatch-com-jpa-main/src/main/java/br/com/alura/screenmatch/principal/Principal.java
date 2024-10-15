package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.*;
import br.com.alura.screenmatch.repository.SerieRepository;
import br.com.alura.screenmatch.service.ConsumoApi;
import br.com.alura.screenmatch.service.ConverteDados;

import java.util.*;

public class Principal {

    private final Scanner leitura = new Scanner(System.in);
    private final ConsumoApi consumo = new ConsumoApi();
    private final ConverteDados conversor = new ConverteDados();
    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=6585022c";
    private List<DadosSerie> dadosSeries = new ArrayList<>();
    private List<Serie> series = new ArrayList<>();
    private final SerieRepository repositorio;
    public Optional<Serie> serieBuscada;
    public Principal(SerieRepository repositorio) {this.repositorio = repositorio;}

    public void exibeMenu() {
        try {
            var menu = """
                    
                    1 - Buscar séries
                    2 - Buscar episódios
                    3 - Listar séries pesquisadas
                    4 - Buscar série por título
                    5 - Buscar série por ator
                    6 - Buscar as Top 5 séries
                    7 - Buscar séries por categoria
                    8 - Buscar por qtde Temporadas e Avaliação
                    9 - Buscar por trecho do título do episódio
                    10 - Buscar os Top 5 episódios de uma séries
                    
                    0 - Sair""";

            var opcao = -1;
            while (opcao != 0) {
                System.out.println(menu);
                opcao = leitura.nextInt();
                leitura.nextLine();

                switch (opcao) {
                    case 1:
                        buscarSerieWeb();
                        break;
                    case 2:
                        buscarEpisodioPorSerie();
                        break;
                    case 3:
                        listarSeriesBuscadas();
                        break;
                    case 4:
                        buscarSeriePorTitulo();
                        break;
                    case 5:
                        buscarSeriePorAtor();
                        break;
                    case 6:
                        buscarTop5();
                        break;
                    case 7:
                        buscarSeriesPorCategoria();
                        break;
                    case 8:
                        buscarPorQtdeTemporadas();
                        break;
                    case 9:
                        buscarTrechoTitulo();
                        break;
                    case 10:
                        topCincoPorSerie();
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();  // Logar exceções detalhadamente
        }
    }

    private void buscarSerieWeb() {
        DadosSerie dados = getDadosSerie();
        Serie serie = new Serie(dados);
        repositorio.save(serie);
        System.out.println(dados);
    }

    private DadosSerie getDadosSerie() {
        System.out.println("Digite o nome da série para busca");
        var nomeSerie = leitura.nextLine();
        var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        return conversor.obterDados(json, DadosSerie.class);
    }

    private void buscarEpisodioPorSerie() {
        listarSeriesBuscadas();
        System.out.println("Digite a série que vc quer buscar episódios");
        var nomeSerie = leitura.nextLine();
        serieBuscada = repositorio.findByTituloContainingIgnoreCase(nomeSerie);

        if (serieBuscada.isPresent()) {
            Serie serieEncontrada = serieBuscada.get();
            List<DadosTemporada> temporadas = new ArrayList<>();

            for (int i = 1; i <= serieEncontrada.getTotalTemporadas(); i++) {
                var json = consumo.obterDados(ENDERECO + serieEncontrada.getTitulo().replace(" ", "+") + "&season=" + i + API_KEY);
                DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
                temporadas.add(dadosTemporada);
            }
            temporadas.forEach(System.out::println);

            List<Episodio> episodios = temporadas.stream()
                    .flatMap(d -> d.episodios().stream()
                            .map(e -> new Episodio(d.numero(), e)))
                    .toList();

            serieEncontrada.setEpisodios(episodios);
            repositorio.save(serieEncontrada);

        } else System.out.println("Série não encontrada");
    }


    private void listarSeriesBuscadas() {
        series = repositorio.findAll();
        series.stream()
                .sorted(Comparator.comparing(Serie::getGenero))
                .forEach(System.out::println);

    }

    private void buscarSeriePorTitulo() {
        System.out.println("Digite a série que vc quer buscar episódios");
        String nomeSerie = leitura.nextLine();
        serieBuscada = repositorio.findByTituloContainingIgnoreCase(nomeSerie);
        if (serieBuscada.isPresent()) {
            System.out.println(serieBuscada.get());
        } else {
            System.out.println("Série não encontrada");
        }
    }

    private void buscarSeriePorAtor() {
        System.out.println("Qual o nome do ator/atriz para busca: ");
        var nomeAtor = leitura.nextLine();
        System.out.println("Avaliações a partir de qual valor: ");
        var avaliacao = leitura.nextDouble();
        List<Serie> seriesEcontradas = repositorio.findByAtoresContainingIgnoreCaseAndAvaliacaoGreaterThanEqual(nomeAtor, avaliacao);
        System.out.println("Séries em que " + nomeAtor + " trabalhou:");
        seriesEcontradas.forEach(s -> System.out.println(s.getTitulo() + " - Avaliação: " + s.getAvaliacao()));
    }

    private void buscarTop5() {
        List<Serie> top5series = repositorio.findTop5ByOrderByAvaliacaoDesc();
        top5series.forEach(s -> System.out.println(s.getTitulo() + " - Avaliação: " + s.getAvaliacao()));
    }

    private void buscarSeriesPorCategoria() {
        System.out.println("Deseja buscar séries de que categoria/gênero:");
        var nomeGenero = leitura.nextLine();
        Categoria categoria = Categoria.fromPortugues(nomeGenero);
        List<Serie> seriesPorCategoria = repositorio.findByGenero(categoria);
        System.out.println("Séries da categoria " + nomeGenero);
        seriesPorCategoria.forEach(System.out::println);
    }

    private void buscarPorQtdeTemporadas() {
        System.out.println("Listar séries de até quantas temporadas:");
        var qtdeTemporadas = leitura.nextInt();
        System.out.println("Avaliação mínima da série: ");
        var avaliacaoMinima = leitura.nextDouble();
        List<Serie> seriesFiltradas = repositorio.buscaPorTotTemporadasEAvaliacao(qtdeTemporadas, avaliacaoMinima);
        System.out.println("Lista das séries com até " + qtdeTemporadas + " temporadas e avaliação mínima de " + avaliacaoMinima);
        seriesFiltradas.forEach(System.out::println);
    }

    private void buscarTrechoTitulo() {
        System.out.println("Digite um trecho do título do episodio que procuras:");
        var trechoTitulo = leitura.nextLine();
        List<Episodio> episodiosPorTrecho = repositorio.episodiosPorTrecho(trechoTitulo);
        episodiosPorTrecho.forEach(e -> System.out.printf("Série: %s - Temporada: %d - Episódio %d - %s",
                e.getSerie().getTitulo(), e.getTemporada(), e.getNumeroEpisodio(), e.getTitulo()));
    }

    private void topCincoPorSerie() {
        buscarSeriePorTitulo();
        if (serieBuscada.isPresent()) {
            List<Episodio> topEpisodios = repositorio.topCincoEpisodiosPorSerie(serieBuscada.get());
            topEpisodios.forEach(e -> {
                System.out.printf("Série: %s - Temporada: %d - Episódio %d - %s - Avaliação: %.1f\n",
                        e.getSerie().getTitulo(), e.getTemporada(), e.getNumeroEpisodio(), e.getTitulo(), e.getAvaliacao());
            });
        }
    }
}