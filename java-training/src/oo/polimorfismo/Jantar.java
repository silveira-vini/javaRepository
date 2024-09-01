package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(99.65);
		
		Arroz a1 = new Arroz(0.200);
		Feijao f1 = new Feijao(0.100);
		Sorvete s1 = new Sorvete(0.4);
		
		p1.comer(a1);
		p1.comer(f1);
		p1.comer(s1);
		
		System.out.println(p1.getPeso());
		
	}
}
