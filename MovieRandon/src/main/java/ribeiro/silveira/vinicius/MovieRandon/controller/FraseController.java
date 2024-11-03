package ribeiro.silveira.vinicius.MovieRandon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ribeiro.silveira.vinicius.MovieRandon.DTO.FraseDTO;
import ribeiro.silveira.vinicius.MovieRandon.service.SerieService;

@RestController
@RequestMapping("/series")
public class FraseController {

    @Autowired
    private SerieService service;

    @GetMapping("/frases")
    public FraseDTO obterFraseAleatoria(){
        return service.obterFraseAleatoria();
    }

}
