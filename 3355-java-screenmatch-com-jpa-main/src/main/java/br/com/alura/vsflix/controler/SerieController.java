package br.com.alura.vsflix.controler;

import br.com.alura.vsflix.dto.EpisodioDTO;
import br.com.alura.vsflix.dto.SerieDTO;
import br.com.alura.vsflix.model.Categoria;
import br.com.alura.vsflix.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series")
public class SerieController {

    @Autowired
    private SerieService servico;

    @GetMapping
    public List<SerieDTO> obterSeries() {
        return servico.obterTodasSeries();
    }

    @GetMapping("/top5")
    public List<SerieDTO> obterTop5Series() {
        return servico.obterTop5Series();
    }

    @GetMapping("/lancamentos")
    public List<SerieDTO> obterLancamentos() {
        return servico.obterLancamentos();
    }

    @GetMapping("/{id}")
    public SerieDTO obterSeriePorID(@PathVariable Long id) {
        return servico.obterSeriePorID(id);
    }

    @GetMapping("/{id}/temporadas/todas")
    public List<EpisodioDTO> obterTodosEpisodios(@PathVariable Long id) {
        return servico.obterTodosEpisodios(id);
    }

    @GetMapping("/{id}/temporadas/{temporada}")
    public List<EpisodioDTO> obterEpisodiosTemporada(@PathVariable Long id, @PathVariable Integer temporada) {
        return servico.obterEpisodiosTemporada(id, temporada);
    }

    @GetMapping("/categoria/{genero}")
    public List<SerieDTO> obterSeriesCategoria(@PathVariable String genero) {
        return servico.obterSeriesCategoria(genero);
    }

}
