package arrays;

import java.util.Scanner;

public class MatrizCG {

	public static void main(String[] args) {

		try (Scanner entrada = new Scanner(System.in)) {

			int qtdeAlunos = lerQuantidade(entrada, "Qual a quantidade de alunos: ");
			int qtdeNotas = lerQuantidade(entrada, "Quantas notas cada aluno possui: ");

			double[][] matrizAlunos = new double[qtdeAlunos][qtdeNotas];

			preencherNotas(entrada, matrizAlunos);

			double media = calcularMedia(matrizAlunos, qtdeAlunos, qtdeNotas);

			System.out.printf("%nMédia de todas as notas de todos os alunos: %.2f%n", media);
		}
	}

	private static int lerQuantidade(Scanner entrada, String mensagem) {
		System.out.print(mensagem);
		return entrada.nextInt();
	}

	private static void preencherNotas(Scanner entrada, double[][] matrizAlunos) {
		for (int i = 0; i < matrizAlunos.length; i++) {
			System.out.printf("%nNOTAS DO %dº ALUNO%n", (i + 1));
			for (int j = 0; j < matrizAlunos[i].length; j++) {
				System.out.printf("%dª nota do aluno nº %d: ", (j + 1), (i + 1));
				matrizAlunos[i][j] = entrada.nextDouble();
			}
		}
	}

	private static double calcularMedia(double[][] matrizAlunos, int qtdeAlunos, int qtdeNotas) {
		double totalNotas = 0;
		for (double[] aluno : matrizAlunos) {
			for (double nota : aluno) {
				totalNotas += nota;
			}
		}
		return totalNotas / (qtdeAlunos * qtdeNotas);
	}
}
