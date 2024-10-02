package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

	private List<ObservadorChegadaAniversariante> observadores = new ArrayList<>();

	public void registrarObservadores(ObservadorChegadaAniversariante observador) {
		observadores.add(observador);
	}

	public void monitorar() {
		Scanner entrada = new Scanner(System.in);

		String valor = "";

		while (!valor.equalsIgnoreCase("sair")) {

			System.out.println("Aniversariante chegou? ");
			valor = entrada.nextLine();

			if ("sim".equalsIgnoreCase(valor)) {
				// Criar o evento
				EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());

				// notificar os observadores!
				observadores.stream().forEach(o -> o.chegou(evento));

			} else if (valor.equalsIgnoreCase("sair")) {

				System.out.println("TCHAU!!");

			} else {

				System.out.println("Alarme falso!");
			}

		}

		entrada.close();
	}

}
