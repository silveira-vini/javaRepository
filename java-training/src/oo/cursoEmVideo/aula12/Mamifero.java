package oo.cursoEmVideo.aula12;

public class Mamifero extends Animal {

	
	private String corDoPelo;

	@Override
	public void locomover() {
		System.out.println("Correndo");
	}

	@Override
	public void alimentar() {
		System.out.println("Mamando");		
	}

	@Override
	public void emitirSom() {
		System.out.println("som de mamífero");
		
	}

	public String getCorDoPelo() {
		return corDoPelo;
	}

	public void setCorDoPelo(String corDoPelo) {
		this.corDoPelo = corDoPelo;
	}
	
}
