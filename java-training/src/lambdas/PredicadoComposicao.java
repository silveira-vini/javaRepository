package lambdas;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		
		Predicate<Integer> isPar = num -> num % 2 == 0;
		
		Predicate<Integer> temTresDigitos = num -> num > 99 && num < 1000;
		
		Function<Boolean, String> result = a -> a ? "é par" : "é ímpar";
		
		
		boolean teste1 = isPar.and(temTresDigitos).test(88);
		System.out.println(teste1);
		
		
		
		boolean resultado = isPar.test(7);
		
		String resultFinal = result.apply(resultado);
		
		System.out.println(resultFinal);
		
		
		
		
		
		
		
		
	}
	
}
