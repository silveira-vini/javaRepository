package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {

		Consumer<String> print = System.out::print;
		Consumer<Integer> printInt = num -> System.out.println(num);

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		UnaryOperator<String> inverte = num -> new StringBuilder(num).reverse().toString();
		Function<String, Integer> inteiro = num -> Integer.parseInt(num, 2);

		nums.stream()
		.map(Integer::toBinaryString)
		.forEach(print);
		System.out.println("");
		
		nums.stream().map(Integer::toBinaryString)
		.map(inverte)
		.forEach(print);
		System.out.println("");
		
		nums.stream()
		.map(Integer::toBinaryString)
		.map(inverte)
		.map(inteiro)
		.forEach(printInt);

	}

}
