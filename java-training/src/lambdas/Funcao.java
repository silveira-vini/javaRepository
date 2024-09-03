package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {

		int num = 58;

		Function<Integer, Integer> triplo = a -> a * 3;

		Function<Integer, String> parOuImpar = a -> (a % 2) == 0 ? a + " é Par" : a + " É impar";
		
		Function<String, String> empolgado = valor -> valor + "!!!!!!";
		
		String resultFinal = triplo
				.andThen(parOuImpar)
				.andThen(empolgado)
				.apply(num);
		
		System.out.println(resultFinal);
		
		
	}

}
