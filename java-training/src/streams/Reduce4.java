package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce4 {

	public static void main(String[] args) {

		List<Integer> listInt = Arrays.asList(1, 2, 3, 4, 5, 6);
		String s = "Aprendendo a codar Java no Eclipse IDE";
		String[] split = s.split(" ");
		List<String> listStr = Arrays.asList(split);
		List<Double> listDbl = Arrays.asList(2.3, 4.6, 7.8);

		// reduce - soma
		Optional<Integer> soma = listInt.stream().reduce((a, b) -> a + b);
		System.out.println(soma.get());

		Integer soma2 = listInt.stream().reduce(0, (a, b) -> a + b);
		System.out.println(soma2);


		
		// reduce - multiplicação
		Optional<Integer> mult = listInt.stream().reduce((a, b) -> a * b);
		System.out.println(mult.get());

		Integer mult2 = listInt.stream().reduce(1, (a, b) -> a * b);
		System.out.println(mult2);

		
		
		// reduce - concatenação
		Optional<String> concatenacao = listStr.stream().reduce((a, b) -> a.concat(b));
		System.out.println(concatenacao.get());
		
		String concatenacao2 = listStr.stream().reduce("", (a,b) -> a.concat(b));
		System.out.println(concatenacao2);
		
		
		// reduce - Math.min
		Optional<Double> valorMin = listDbl.stream().reduce((a,b) -> Math.min(a, b));
		System.out.println(valorMin.get());
		
		Double valorMin2 = listDbl.stream().reduce(Double.POSITIVE_INFINITY, (a,b) -> Math.min(a, b));
		System.out.println(valorMin2);

	}

}
