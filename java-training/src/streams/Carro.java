package streams;

public class Carro {

	private String marca;
	private String modelo;
	private int ocupantes;
	private int potencia;
	private double velocidadeMaxima;
	
	public Carro(String marca, String modelo
			,int ocupantes
			,int potencia
			,double velocidadeMaxima) {
		this.marca = marca;
		this.modelo = modelo;
		this.ocupantes = ocupantes;
		this.potencia = potencia;
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modele) {
		this.modelo = modele;
	}

	public int getOcupantes() {
		return ocupantes;
	}

	public void setOcupantes(int ocupantes) {
		this.ocupantes = ocupantes;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	
	
	
	
	
}
