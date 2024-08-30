package oo.cursoEmVideo.aula11;

public class Bolsista extends Aluno{

	private int bolsa;
	
	public void renovarBolsa() {
		this.bolsa++;
	}

	@Override
	public void pagarMensalidade() {
		this.bolsa++;
	}
	
	
	
	
}
