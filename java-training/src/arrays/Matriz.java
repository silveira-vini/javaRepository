package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual a quantidade de alunos: ");
		int qtdeAlunos = entrada.nextInt();

		System.out.println("Quantas notas cada aluno possui: ");
		int qtdeNotas = entrada.nextInt();

		double[][] matrizAlunos = new double[qtdeAlunos][qtdeNotas];

		double totalNotas = 0;

		for (int i = 0; i < matrizAlunos.length; i++) {

			System.out.printf("NOTAS DO %dº ALUNO\n", (i + 1));

			for (int j = 0; j < qtdeNotas; j++) {
				System.out.printf("%dº nota do aluno nº %d: ", j + 1, i + 1);
				matrizAlunos[i][j] = entrada.nextDouble();
				totalNotas += matrizAlunos[i][j];
			}
		}

		double media = totalNotas / (qtdeAlunos * qtdeNotas);

		System.out.printf("\nMédia de todas as notas de todos os alunso: %.2f \n", media);
		
		for (double[] ds : matrizAlunos) {
			System.out.println(Arrays.toString(ds));
		}

		entrada.close();
	}
}
