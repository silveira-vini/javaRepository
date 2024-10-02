package ribeiro.silveira.vinicius.javaChalangeSpring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ribeiro.silveira.vinicius.javaChalangeSpring.main.Principal;

@SpringBootApplication
public class TabelaFipeApp implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TabelaFipeApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Principal main = new Principal();
        main.buscarVeiculo();
    }
}
