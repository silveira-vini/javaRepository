package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {

		Calculo calc = (x, y) -> x + y;
		
		System.out.println(calc.executar(3, 2));
		
		calc = (x, y) -> x * y;
		
		System.out.println(calc.executar(3, 2));
		System.out.println(calc.legal());
		System.out.println(Calculo.muitoLegal());

	}

}
