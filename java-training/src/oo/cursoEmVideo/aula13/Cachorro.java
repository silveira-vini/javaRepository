package oo.cursoEmVideo.aula13;

public class Cachorro extends Lobo {

	@Override
	public void emitirSom() {
		System.out.println("Latir");
	}

	public void reagir(String frase) {
		if ((frase.equals("Toma comida")) || (frase.equals("Olá"))) {
			System.out.println("Abanar e Latir");
		} else {
			System.out.println("Rosnar");
		}
	}

	public void reagir(int hora, int min) {
		if (hora <= 12) {
			System.out.println("Abanar");
		} else if (hora <= 18) {
			System.out.println("ignorar");
		} else {
			System.out.println("abanar e latir");
		}
	}

	public void reagir(boolean dono) {
		if (dono) {
			System.out.println("Abanar");
		} else {
			System.out.println("rosnar e latir");
		}
	}

	public void reagir(int idade, double peso) {
		if (idade <= 2) {
			if (peso <= 5) {
				System.out.println("abanar");
			} else {
				System.out.println("Latir");
			}
		} else {
			if (peso <= 5) {
				System.out.println("rosnar");
			} else {
				System.out.println("ignorar");
			}
		}
	}
}
