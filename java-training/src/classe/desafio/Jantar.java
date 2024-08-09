package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Fátima", 54);
		
		Comida c1 = new Comida("Arroz", 0.5);
		Comida c2 = new Comida("Feijão", 0.4);
		
		System.out.println("Peso de " + p1.nome + ": " + p1.peso + "Kg");
		
		p1.comer(c1);
		p1.comer(c2);
		
		System.out.println("Peso de " + p1.nome + " depois de comer " + c1.nome +
				" e " + c2.nome + ": " + p1.peso + "Kg");

}
}