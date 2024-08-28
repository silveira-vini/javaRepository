package oo.cursoEmVideo.aula07;

public class Lutador {

// ------------- Atributos ------------------------
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;

// ------------- Métodos ------------------------
	public void apresentar() {
		System.out.printf("Lutando representando o %s temos o Lutador %s. Ele tem %d anos, altura %f, pesando %fkg. Seu recorde é %d-%d-%d.", 
				getNacionalidade(), getNome(), getIdade(), getAltura(), getPeso(), getVitorias(), getDerrotas(), getEmpates());
	}

	public void status() {
		System.out.printf("Nome: %s \n Categoria: %s \n Recorde: %d-%d-%d", 
				getNome(), getCategoria(), getVitorias(), getDerrotas(), getEmpates());
	}

	public void ganharLuta() {
		setVitorias(getVitorias() + 1);
	}

	public void perderLuta() {
		setDerrotas(getDerrotas() + 1);
	}

	public void empatarLuta() {
		setEmpates(getEmpates() + 1);
	}

// ------------- Método Construtor ------------------------
	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, 
			int vitorias, int derrotas, int empates) {
		setNome(nome);
		setNacionalidade(nacionalidade);
		setIdade(idade);
		setAltura(altura);
		setPeso(peso);
		setVitorias(vitorias);
		setDerrotas(derrotas);
		setEmpates(empates);
	}

// ------------- Getters & Setters ------------------------
	private String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private String getNacionalidade() {
		return nacionalidade;
	}

	private void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	private int getIdade() {
		return idade;
	}

	private void setIdade(int idade) {
		this.idade = idade;
	}

	private double getAltura() {
		return altura;
	}

	private void setAltura(double altura) {
		this.altura = altura;
	}

	private double getPeso() {
		return peso;
	}

	private void setPeso(double peso) {
		this.peso = peso;
		setCategoria();
	}

	private String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if (peso < 52.2) {
			this.categoria = "Inválido";
		} else if (peso <= 70.3) {
			this.categoria = "Leve";
		} else if (peso <= 83.9) {
			this.categoria = "Médio";
		} else if (peso <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Inválido";
		}
	}

	private int getVitorias() {
		return vitorias;
	}

	private void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	private int getDerrotas() {
		return derrotas;
	}

	private void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	private int getEmpates() {
		return empates;
	}

	private void setEmpates(int empates) {
		this.empates = empates;
	}

}
