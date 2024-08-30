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

	@SuppressWarnings("unused")
	private String getTitulo() {
		return titulo;
	}

	@SuppressWarnings("unused")
	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@SuppressWarnings("unused")
	private String getAutor() {
		return autor;
	}

	@SuppressWarnings("unused")
	private void setAutor(String autor) {
		this.autor = autor;
	}

	private int getTotPaginas() {
		return totPaginas;
	}

	@SuppressWarnings("unused")
	private void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	private int getPagAtual() {
		return pagAtual;
	}

	private void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	@SuppressWarnings("unused")
	private boolean isAberto() {
		return aberto;
	}

	private void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	@SuppressWarnings("unused")
	private Pessoa getLeitor() {
		return leitor;
	}

	@SuppressWarnings("unused")
	private void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

// Métodos da interface ------------------

	@Override
	public void abrir() {
		this.setAberto(true);
	}

	@Override
	public void fechar() {
		this.setAberto(false);
	}

	@Override
	public void folhear(int pagina) {
		if (pagina > this.getTotPaginas()) {
			this.setPagAtual(this.getTotPaginas());
		} else {
			this.setPagAtual(pagina);
		}
	}

	@Override
	public void avancarPag() {
		if (this.getPagAtual() < this.getTotPaginas()) {
			this.setPagAtual(this.getPagAtual() + 1);
		}
		
	}

	@Override
	public void voltarPag() {
		if (this.getPagAtual() > 0) {
			this.setPagAtual(this.getPagAtual() - 1);
		}
	}

}
