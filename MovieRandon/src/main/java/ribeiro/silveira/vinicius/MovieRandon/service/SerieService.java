package ribeiro.silveira.vinicius.MovieRandon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ribeiro.silveira.vinicius.MovieRandon.DTO.FraseDTO;
import ribeiro.silveira.vinicius.MovieRandon.model.Frase;
import ribeiro.silveira.vinicius.MovieRandon.repository.FraseRepository;

@Service
public class SerieService {

    @Autowired
    private FraseRepository repository;

    public FraseDTO obterFraseAleatoria() {
        return converterFraseDTO(repository.buscaFraseAleatoria());
    }

    private FraseDTO converterFraseDTO (Frase f) {
        return new FraseDTO(f.getTitulo(), f.getFrase(), f.getPersonagem(), f.getPoster());
    }

}
