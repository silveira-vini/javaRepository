package oo.thiagoAguiar;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	public static List<Long> gerarFibonacci(int quantidade) {

		List<Long> fibonacci = new ArrayList<>();
		fibonacci.add((long) 0);
		fibonacci.add((long) 1);

		for (int i = 2; i < quantidade; i++) {
			long nextNumber = fibonacci.get(i - 1) + fibonacci.get(i - 2);
			fibonacci.add(nextNumber);
		}
		return fibonacci;
	}
}