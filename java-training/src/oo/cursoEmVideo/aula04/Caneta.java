package oo.cursoEmVideo.aula04;

public class Caneta {

	private String modelo;
	private double ponta;
	private String cor;
	private boolean tampada;

	public Caneta(String modelo, double ponta, String cor) {
		super();
		this.modelo = modelo;
		this.ponta = ponta;
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPonta() {
		return ponta;
	}

	public void setPonta(double ponta) {
		this.ponta = ponta;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

}
