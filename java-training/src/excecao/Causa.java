package excecao;

public class Causa {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Vini", 7);
		
		metodoA(a1);
		metodoA(null);
		
	}

	static void metodoA(Aluno aluno) {
		try {
			metodoB(aluno);
		} catch (Exception e) {
			System.out.println("Erro log: " + e.getMessage());
		}

	}

	static void metodoB(Aluno aluno) {
		if (aluno == null) {
			throw new NullPointerException("O aluno está nulo");
		}

		System.out.println(aluno.nome);

	}

}
