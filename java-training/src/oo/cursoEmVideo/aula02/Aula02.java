package oo.cursoEmVideo.aula02;

public class Aula02 {
	
	public static void main(String[] args) {

		Caneta c1 = new Caneta();
		c1.modelo = "Bic";
		c1.cor = "Azul";
		// c1.ponta = 0.5;
		c1.carga = 0;
		c1.tampar();
		
		c1.rabiscar();
		c1.destampar();
		c1.rabiscar();
		
	}
}
