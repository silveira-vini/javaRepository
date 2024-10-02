package excecao;

public class ChecadaVxNaoChecada {

	public static void main(String[] args) {

		System.out.println("Começou o programa");

		erro1();

		try {
			erro2();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

		try {
			erro3();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			;
		}

		System.out.println("Fim do programa");
	}

	// não checada ou não verificada (o erro não foi tratado)
	static void erro1() {
		throw new RuntimeException("Ocorreu um erro #1");
	}

	// checada ou verificada (o erro não tratado, porém não era necessário, pois não
	// gera erro de compilação)
	static void erro2() {
		throw new RuntimeException("Ocorreu um erro #2");
	}

	// Exceção checada ou verificada (o tratamento é obrigatório)
	static void erro3() throws Exception {
		throw new Exception("Ocorreu um erro #3");
	}
}