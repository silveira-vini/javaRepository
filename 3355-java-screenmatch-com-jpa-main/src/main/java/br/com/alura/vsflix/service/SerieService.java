package br.com.alura.vsflix.service;

import br.com.alura.vsflix.dto.SerieDTO;
import br.com.alura.vsflix.model.Serie;
import br.com.alura.vsflix.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
                .collect(Collectors.toList());
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
