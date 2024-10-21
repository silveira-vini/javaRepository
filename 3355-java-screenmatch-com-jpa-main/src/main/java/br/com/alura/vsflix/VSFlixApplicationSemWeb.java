package br.com.alura.vsflix;

import br.com.alura.vsflix.principal.Principal;
import br.com.alura.vsflix.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@SpringBootApplication
public class VSFlixApplicationSemWeb implements CommandLineRunner {

	@Autowired
	private SerieRepository repositorio;

	public static void main(String[] args) {
		SpringApplication.run(VSFlixApplicationSemWeb.class, args);
	}

	@Override
	public void run(String... args) {
		try {
			Principal principal = new Principal(repositorio);
			principal.exibeMenu();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
*/
