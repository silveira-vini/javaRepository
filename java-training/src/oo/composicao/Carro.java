package oo.composicao;

public class Carro {

	Motor motor = new Motor();

	void ligar() {
		motor.ligado = true;
		motor.fatorInjecao = 1;
	}

	void desligar() {
		motor.ligado = false;
	}

	void acelerar() {
		if (motor.fatorInjecao < 2.5) {
			motor.fatorInjecao += 0.4;
		}
	}

	void freiar() {
		if (motor.fatorInjecao > 0.3) {
			motor.fatorInjecao -= 0.4;
		}
	}

	boolean estaLigado() {
		return motor.ligado;
	}
}
