package lambdas;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {

		Produto p1 = new Produto("Caneta", 5.84, 0.20);
		Predicate<Produto> isCaro =	prod -> (p1.preco * (1 - p1.desconto )) > 5;
		
		System.out.println(isCaro.test(p1));
		

	}
}
