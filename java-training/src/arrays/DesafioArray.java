package arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US);

		System.out.println("Quantas notas vc vai informar do aluno:");

		int qnteNotas = entrada.nextInt();

		double[] notas = new double[qnteNotas];

		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Qual é a %dª nota: ", i + 1);
			double nota = entrada.nextDouble();
			notas[i] = nota;
		}

		double totalNotas = 0;

		for (double n : notas) {
			totalNotas += n;

		}

		double media = totalNotas / notas.length;

		System.out.println("Notas: " + Arrays.toString(notas));
		System.out.printf("Média final: %.2f", media);

		entrada.close();

	}

}
