package oo.cursoEmVideo.aula04;

public class Aula04 {

	public static void main(String[] args) {

		Caneta c1 = new Caneta("Faber Castel", 1.5, "Verde");

		System.out.println(c1.getModelo());
		System.out.println(c1.getPonta());
		System.out.println(c1.getCor());
		
		c1.setCor("Amarelo");
		System.out.println(c1.getCor());
		
		

	}

}
