package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Function<Produto, Double> desconto = a -> a.preco * (1 - a.desconto);
		UnaryOperator<Double> imposto = a -> a >= 2500 ? a * 1.085 : a;
		UnaryOperator<Double> frete = a -> a >= 3000 ? a + 100.00 : a + 50.00;
		Function<Double, String> arredondar = a -> String.format("%.2f", a);
		UnaryOperator<String> precoFinal = a -> "R$ " + a;
		
		Produto p1 = new Produto("iPad", 3235.89, 0.13);
		String p1Final = desconto
				.andThen(imposto)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(precoFinal)
				.apply(p1);
		System.out.println(p1Final);
		
		
		
		Produto p2 = new Produto("Bicileta", 1334.87, 0.05);
		String p2Final = desconto
				.andThen(imposto)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(precoFinal)
				.apply(p2);
		System.out.println(p2Final);
		
		
	}
	
}
