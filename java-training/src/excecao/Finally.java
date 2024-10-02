package excecao;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		try {

			System.out.println("Digite o divisor de 7:");
			System.out.println("Resultado: " + (7 / entrada.nextInt()));

		} catch (Exception e) {

			System.out.println("Erro: " + e.getMessage());

		} finally {
			System.out.println("Finally chamado");
			entrada.close();

		}

		System.out.println("Fim!!");

	}

}
