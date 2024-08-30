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
		System.out.println(a1.toString());
		
		Bolsista b1 = new Bolsista();
		b1.pagarMensalidade();
		b1.setNome("Rafael");
		b1.pagarMensalidade();
		System.out.println(b1.toString());
	}

}
