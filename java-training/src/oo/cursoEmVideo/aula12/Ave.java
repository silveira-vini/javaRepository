package oo.cursoEmVideo.aula12;

public class Ave extends Animal {

	private String corDaPena;

	@Override
	public void locomover() {
		System.out.println("Voando");
	}

	@Override
	public void alimentar() {
		System.out.println("comendo frutas");
	}

	@Override
	public void emitirSom() {
		System.out.println("canto da ave");
	}
	
	public void setCorDaPena(String corDaPena) {
		this.corDaPena = corDaPena;
	}
	
	public void fazerNinho() {
		System.out.println("Fazendo ninho");
	}

	public String getCorDaPena() {
		return corDaPena;
	}
	
}
