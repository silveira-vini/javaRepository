package oo.cursoEmVideo.projetoYoutube;

public class Visualizacao {

	private Gafanhoto espectador;
	private Video filme;

	public Visualizacao(Gafanhoto espectador, Video filme) {
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
		this.filme.setViews(this.filme.getViews() + 1);
	}

	public void avaliar() {
		System.out.printf("O Gafanhoto não avaliou. Digite a avaliação \n");
	}

	public void avaliar(int nota) {
		this.filme.setAvaliacao(nota);
		System.out.printf("O Gafanhoto %s avaliou o video '%s' \n", this.espectador.getNome(), this.filme.getTitulo());
		System.out.println("Avaliação: " + nota);
	}

	public void avaliar(double porc) {
		double notaFinal = porc * 100;
		this.filme.setAvaliacao(notaFinal);
		System.out.printf("O Gafanhoto %s avaliou o video '%s' \n", this.espectador.getNome(), this.filme.getTitulo());
		System.out.println("Avaliação: " + notaFinal + "%");
	}

	public Gafanhoto getEspectador() {
		return espectador;
	}

	public void setEspectador(Gafanhoto espectador) {
		this.espectador = espectador;
	}

	public Video getFilme() {
		return filme;
	}

	public void setFilme(Video filme) {
		this.filme = filme;
	}

	@Override
	public String toString() {
		return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
	}

}
