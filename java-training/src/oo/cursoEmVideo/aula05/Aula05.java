package oo.cursoEmVideo.aula05;

public class Aula05 {

	public static void main(String[] args) {
		
		ContaBanco c1 = new ContaBanco(2345, "cc", "Vinicius Silveira");
		ContaBanco c2 = new ContaBanco(3456, "cp", "Fabiana Barbosa");

		// ----------------------------------------------------
		
		System.out.println(c1.getDono());
		System.out.println(c1.getNumConta());
		System.out.println(c1.tipo);
		System.out.println(c1.getSaldo());
		System.out.println(c1.isStatus());
		System.out.println("");
		
		
		c1.depositar(750);
		System.out.println("");
					
		
		c1.abrirConta();
		System.out.println(c1.getSaldo());
		System.out.println(c1.isStatus());
		System.out.println("");
		
		c1.depositar(750);
		System.out.println(c1.getSaldo());
		System.out.println("");

		c1.sacar(1100);
		System.out.println("");
		
		c1.sacar(500);
		System.out.println(c1.getSaldo());
		System.out.println("");
		
		c1.pagarMensalidade();
		System.out.println(c1.getSaldo());
		System.out.println("");
		
		c1.fecharConta();
		System.out.println();
		
		c1.sacar(250);
		System.out.println(c1.getSaldo());
		System.out.println("");
		
		c1.fecharConta();
		System.out.println("----------------------------------");
		System.out.println("");
		
		
		
		// -----------------------------------------------------
		
		System.out.println(c2.getDono());
		System.out.println(c2.getNumConta());
		System.out.println(c2.tipo);
		System.out.println(c2.getSaldo());
		System.out.println(c2.isStatus());
		System.out.println("");
		
		
		c2.depositar(750);
		System.out.println("");
					
		
		c2.abrirConta();
		System.out.println(c2.getSaldo());
		System.out.println(c2.isStatus());
		System.out.println("");
		
		c2.depositar(750);
		System.out.println(c2.getSaldo());
		System.out.println("");

		c2.sacar(1100);
		System.out.println("");
		
		c2.sacar(500);
		System.out.println(c2.getSaldo());
		System.out.println("");
		
		c2.pagarMensalidade();
		System.out.println(c2.getSaldo());
		System.out.println("");
		
		c2.fecharConta();
		System.out.println();
		
		c2.sacar(380);
		System.out.println(c2.getSaldo());
		System.out.println("");
		
		c2.fecharConta();
	}
	
}
