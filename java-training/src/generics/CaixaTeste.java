package generics;

public class CaixaTeste {

	public static void main(String[] args) {
		
		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar("Vini");
		System.out.println(caixaA.abrir());
		
		Caixa<Double> caixaB = new Caixa<Double>();
		caixaB.guardar(2.8);
		System.out.println(caixaB.abrir());
		
		
	}
}
