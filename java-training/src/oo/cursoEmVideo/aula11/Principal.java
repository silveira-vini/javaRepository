package oo.cursoEmVideo.aula11;

public class Principal {

	public static void main(String[] args) {

		// Pessoa p1 = new Pessoa();  (a classe Mãe é abstrata, não pode instanciar)
		
		Visitante v1 = new Visitante();
		v1.setNome("Vinicius");
		v1.setIdade(35);
		v1.setSexo("M");
		
		System.out.println(v1.toString());
		
		Aluno a1 = new Aluno();
		a1.setNome("Claudio");
		a1.setCurso("ADS");
		a1.setSexo("M");
		System.out.println(a1.toString());
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setNome("Rafael");
		b1.setSexo("M");
		b1.setIdade(25);
		System.out.println(b1.toString());
		b1.pagarMensalidade();
	}

}
