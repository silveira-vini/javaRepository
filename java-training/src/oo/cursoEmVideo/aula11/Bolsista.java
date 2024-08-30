package oo.cursoEmVideo.aula11;

public class Bolsista extends Aluno{

	private int bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando a bolsa do aluno " + this.nome);
	}

	@Override
	public void pagarMensalidade() {
		System.out.println(this.nome + " é bolsista. Pagamento facilitado");
	}

	public int getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
	
	
	
	
}
