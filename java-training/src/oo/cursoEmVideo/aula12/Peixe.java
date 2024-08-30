package oo.cursoEmVideo.aula12;

public class Peixe extends Animal {

	private String corDaEscama;

	@Override
	public void locomover() {
		System.out.println("Nadando...");
	}

	@Override
	public void alimentar() {
		System.out.println("comendo algas");
	}

	@Override
	public void emitirSom() {
		System.out.println("falando peixês");
	}

	public void soltarBolha() {
		System.out.println("soltou uma bolha");
	}

	public String getCorDaEscama() {
		return corDaEscama;
	}

	public void setCorDaEscama(String corDaEscama) {
		this.corDaEscama = corDaEscama;
	}

	
	
}
