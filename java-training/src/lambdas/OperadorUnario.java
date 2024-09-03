package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesTres = n -> n * 3;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		Function<Integer, Double> raizQuadrada = n -> Math.sqrt(n);
		
		int numInicial = 2;
		
		int resultado1 = maisDois
				.andThen(aoQuadrado)
				.andThen(vezesTres)
				.apply(numInicial);
		
		double resultado2 = raizQuadrada.apply(resultado1);
				
		System.out.println(resultado1);
		System.out.println(resultado2);
		
		
		
		
		
	}
	
}
