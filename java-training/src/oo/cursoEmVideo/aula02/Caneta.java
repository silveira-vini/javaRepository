package oo.cursoEmVideo.aula02;

public class Caneta {

	public String modelo;
	public String cor;
	// private double ponta;
	protected int carga;
	private boolean tampada;
	
	public void status() {
		System.out.println("Essa caneta é " + cor);
		System.out.println("Essa caneta está tampada: " + tampada);
	}
	
	public void rabiscar() {
		if(this.tampada == true) {
			System.out.println("ERRO - Caneta tampada");
		} else {
			System.out.println("Estou rabiscando");
		}
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
}