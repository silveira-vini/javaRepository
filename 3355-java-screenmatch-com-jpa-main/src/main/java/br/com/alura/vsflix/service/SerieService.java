package br.com.alura.vsflix.service;

import br.com.alura.vsflix.dto.EpisodioDTO;
import br.com.alura.vsflix.dto.SerieDTO;
import br.com.alura.vsflix.model.Categoria;
import br.com.alura.vsflix.model.Episodio;
import br.com.alura.vsflix.model.Serie;
import br.com.alura.vsflix.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@Service
public class SerieService {

    @Autowired
    private SerieRepository repositorio;

    public List<SerieDTO> obterTodasSeries() {
        return converteSeriesDTO(repositorio.findAll());
    }

    public List<SerieDTO> obterTop5Series() {
        return converteSeriesDTO(repositorio.findTop5ByOrderByAvaliacaoDesc());
    }

    public List<SerieDTO> obterLancamentos() {
        return converteSeriesDTO(repositorio.encontrarEpisodiosMaisRecentes());
    }

    public SerieDTO obterSeriePorID(Long id) {
        Optional<Serie> serie = repositorio.findById(id);
        return serie.map(this::converteSerieDTO).orElse(null);
    }

    public List<SerieDTO> obterSeriesCategoria(String genero) {
        Categoria categoria = Categoria.fromPortugues(genero);
        return converteSeriesDTO(repositorio.findByGenero(categoria));
    }

    public List<EpisodioDTO> obterTodosEpisodios(Long id) {
        Optional<Serie> serie = repositorio.findById(id);
        return serie.map(s -> s.getEpisodios().stream().
                map(e -> new EpisodioDTO(e.getTemporada(),
                        e.getNumeroEpisodio(),
                        e.getTitulo())).
                toList()).orElse(null);
    }

    public List<EpisodioDTO> obterEpisodiosTemporada(Long id, Integer temporada) {
        Optional<Serie> serie = repositorio.findById(id);
        return serie.map(s -> s.getEpisodios().stream().
                filter(e -> e.getTemporada().equals(temporada)).
                map(e -> new EpisodioDTO(e.getTemporada(),
                        e.getNumeroEpisodio(),
                        e.getTitulo())).
                toList()).orElse(null);
    }

    public List<EpisodioDTO> obterTop5Episodios(Long id) {
        return converterDadosEpisodios(repositorio.top5EpisodiosPorId(id));
    }

    private List<EpisodioDTO> converterDadosEpisodios(List<Episodio> episodios) {
        return episodios.stream()
                .map(e -> new EpisodioDTO(e.getTemporada(),e.getNumeroEpisodio(), e.getTitulo()))
                .collect(Collectors.toList());
    }

    private List<SerieDTO> converteSeriesDTO(List<Serie> series) {
        return series.stream()
                .map(s -> new SerieDTO(s.getId(),
                        s.getTitulo(),
                        s.getTotalTemporadas(),
                        s.getAvaliacao(),
                        s.getGenero(),
                        s.getAtores(),
                        s.getPoster(),
                        s.getSinopse()))
                .collect(toList());
    }

    private SerieDTO converteSerieDTO(Serie s) {
        return new SerieDTO(s.getId(),
                s.getTitulo(),
                s.getTotalTemporadas(),
                s.getAvaliacao(),
                s.getGenero(),
                s.getAtores(),
                s.getPoster(),
                s.getSinopse());
    }


}
