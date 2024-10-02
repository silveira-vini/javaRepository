package excecao;

public class Basico {

	
	public static void main(String[] args) {

		Aluno a1 = null;
		
		try {
			imprimirNomeAluno(a1);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro no momento de"
					+ " imprimir o nome do usuário");
		}
		
		
		try {
			System.out.println( 7 / 0);
		} catch (ArithmeticException e) {
			System.out.println("ocorreu um erro: " + e.getMessage());
		}
		
		
		
		
		System.out.println("Fim do programa");
		
		
	}
	
	public static void imprimirNomeAluno(Aluno aluno) {
		System.out.println(aluno.nome);
		
	}
	
	
	
}
