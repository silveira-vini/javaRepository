package arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int qtdeAlunos;
		int qtdeNotas;

		System.out.println("Qual a quantidade de alunos: ");
		qtdeAlunos = entrada.nextInt();

		System.out.println("Quantas notas cada aluno possui: ");
		qtdeNotas = entrada.nextInt();

		double[][] matrizAlunos = new double[qtdeAlunos][qtdeNotas];

		for (int i = 0; i < matrizAlunos.length; i++) {

			System.out.printf("NOTAS DO %dº ALUNO\n", (i + 1));

			for (int j = 0; j < qtdeNotas; j++) {
				System.out.printf("%dº nota do aluno nº %d: ", (j + 1), (i + 1));
				double nota = entrada.nextDouble();
				matrizAlunos[i][j] = nota;
			}
		}

		double totalNotas = 0;

		for (double[] aluno : matrizAlunos) {
			for (double nota : aluno) {
				totalNotas += nota;
			}
		}

		double media = totalNotas / (qtdeAlunos * qtdeNotas);

		System.out.println("");
		System.out.printf("Média de todas as notas de todos os alunso: %.2f", media);

		entrada.close();
	}
}
