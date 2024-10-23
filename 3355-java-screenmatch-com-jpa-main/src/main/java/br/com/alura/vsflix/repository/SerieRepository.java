package br.com.alura.vsflix.repository;

import br.com.alura.vsflix.model.Categoria;
import br.com.alura.vsflix.model.Episodio;
import br.com.alura.vsflix.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface SerieRepository extends JpaRepository<Serie, Long> {

    Optional<Serie> findByTituloContainingIgnoreCase(String nomeSerie);
    List<Serie> findByAtoresContainingIgnoreCaseAndAvaliacaoGreaterThanEqual(String nomeAtor, double avaliacao);
    List<Serie> findTop5ByOrderByAvaliacaoDesc();
    List<Serie> findByGenero(Categoria categoria);
    List<Serie> findByTotalTemporadasLessThanEqualAndAvaliacaoGreaterThanEqual(int totalTemporadas, double avaliacao);
    @Query("select s from Serie s where s.totalTemporadas <= :totalTemporadas and s.avaliacao >= :avaliacao")
    List<Serie> buscaPorTotTemporadasEAvaliacao(int totalTemporadas, double avaliacao);
    @Query("SELECT e FROM Serie s JOIN s.episodios e WHERE e.titulo ILIKE %:trechoTitulo%")
    List<Episodio> episodiosPorTrecho(String trechoTitulo);
    @Query("SELECT e FROM Serie s JOIN s.episodios e WHERE s = :serie ORDER BY e.avaliacao DESC LIMIT 5")
    List<Episodio> topCincoEpisodiosPorSerie(Serie serie);
    @Query("SELECT e FROM Serie s JOIN s.episodios e WHERE s = :serie AND YEAR(e.dataLancamento) >= :anoBuscado")
    List<Episodio> episodiosPorAno(Serie serie, int anoBuscado);
    @Query("SELECT s FROM Serie s " +
            "JOIN s.episodios e " +
            "GROUP BY s " +
            "ORDER BY MAX(e.dataLancamento) DESC LIMIT 5")
    List<Serie> encontrarEpisodiosMaisRecentes();


}
