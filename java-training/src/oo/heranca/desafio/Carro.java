package oo.heranca.desafio;

public class Carro {

	private int velocidade;

	public void acelerar() {
		
		if (this.velocidade <= 380) {
			velocidade += 10;
		} else {
			this.velocidade = 380;
		}
	}

	public void freiar() {
		if (this.velocidade >= 10) {
			velocidade -= 10;
		} else {
			velocidade = 0;
		}
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

}
