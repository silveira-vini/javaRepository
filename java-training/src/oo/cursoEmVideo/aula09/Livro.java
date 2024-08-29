package oo.cursoEmVideo.aula09;

public class Livro implements Publicacao {

// Atributos --------------------------------------
	private String titulo, autor;
	private int totPaginas, pagAtual;
	private boolean aberto;
	private Pessoa leitor; // relação com a classe Pessoa

// Contrutor ----------------------------------------
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.pagAtual = 0;
		this.aberto = false;
		this.leitor = leitor;
	}

// Método -------------------------------------------
	public void detalhes() {
		System.out.println("===============================");
		System.out.println("Título: " + this.titulo);
		System.out.println("Autor: " + this.autor);
		System.out.println("Total de Páginas: " + this.totPaginas);
		if (this.aberto) {
			System.out.println("Página atual: " + this.pagAtual);
			System.out.println("Leitor: " + this.leitor.getNome());
		} else {
			System.out.println("O livro está fechado");
		}
	}

// Getters and Setters ---------------------------------

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

// Métodos da interface ------------------

	public void abrir() {
		this.setAberto(true);
	}

	public void fechar() {
		this.setAberto(false);
	}

	public void folhear(int pagina) {
		if (pagina > this.getTotPaginas()) {
			this.setPagAtual(this.getTotPaginas());
		} else {
			this.setPagAtual(pagina);
		}
	}

	public void avancarPag() {
		if (this.getPagAtual() < this.getTotPaginas()) {
			this.setPagAtual(this.getPagAtual() + 1);
		}
		
	}

	public void voltarPag() {
		if (this.getPagAtual() > 0) {
			this.setPagAtual(this.getPagAtual() - 1);
		}
	}

}
