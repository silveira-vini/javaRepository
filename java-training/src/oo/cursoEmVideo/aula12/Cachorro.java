package oo.cursoEmVideo.aula12;

public class Cachorro extends Mamifero {

	public void enterrarOsso() {
		System.out.println("enterrando osso");
	}
	
	public void abanarRabo() {
		System.out.println("Abanando rabo");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Latir");
	}
	
}