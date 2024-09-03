package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {

		BinaryOperator<Double> media = (a, b) -> (a + b) / 2;

		double n1 = 8.5;
		double n2 = 9.3;
		double mediaFinal = media.apply(n1, n2);

		System.out.println(mediaFinal);

		BiFunction<Double, Double, String> mencao = (a, b) -> {
			double notaFinal = (a + b) / 2;
			return notaFinal >= 7 ? "Aprovado"	: "Reprovado";
		};
		
		System.out.println(mencao.apply(n1, n2));
		
		Function<Double, String> conceito = nota -> nota >= 7 ? "Aprovado" : "Reprovado";
		
		System.out.println(media.andThen(conceito).apply(n1, n2));
		
		
	}
}
