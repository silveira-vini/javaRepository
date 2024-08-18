package oo.thiagoAguiar;

import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite quantos números da sequencia de Fibonacci: ");
		
		int qdte = input.nextInt();
		
		List<Long> fibonnacci = Fibonacci.gerarFibonacci(qdte);

		for (Long number : fibonnacci) {
			System.out.println(number);
		}
		
		input.close();

	}

}
