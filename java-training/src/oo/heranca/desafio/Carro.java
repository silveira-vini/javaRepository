package oo.heranca.desafio;

public class Carro {

	private int velocidade;
	private int VELOCIDADE_MAXIMA;

	public void Carro(int velocidadeMaxima) {
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		
		if (this.velocidade > this.VELOCIDADE_MAXIMA) {
			this.velocidade = this.VELOCIDADE_MAXIMA;
		} else {
			this.velocidade += 5;
		}
	}

	public void freiar() {
		if (this.velocidade <= 15) {
			velocidade = 0;
		} else {
			velocidade -= 5;
		}
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	@Override
	public String toString() {
		return "Carro [velocidade=" + velocidade + "]";
	}

	public int getVELOCIDADE_MAXIMA() {
		return VELOCIDADE_MAXIMA;
	}

	public void setVELOCIDADE_MAXIMA(int vELOCIDADE_MAXIMA) {
		VELOCIDADE_MAXIMA = vELOCIDADE_MAXIMA;
	}
	
	

	

	
	
}
