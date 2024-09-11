package generics;

public class CaixaNumTente {

	public static void main(String[] args) {
		
		CaixaNumero<Double> cx1 = new CaixaNumero<>();
		cx1.guardar(5.0);
		System.out.println(cx1.abrir());
		
	}

}
