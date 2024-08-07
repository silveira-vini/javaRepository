package classes;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook");
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		System.out.println(p1.nome);
		System.out.println(p1.precoComDesconto());

		var p2 = new Produto();
		p2.nome = "Caneta preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		System.out.println(p2.nome);
		System.out.println(p2.precoComDesconto(0.1));
		
		Produto p3 = new Produto("Calculadora", 56.50);
		p3.desconto = 0.2;
		System.out.println(p3.nome);
		System.out.println(p3.precoComDesconto(0.3));

		Produto p4 = new Produto("Teclado", 56.50, 0.15);
		System.out.println(p4.nome);
		System.out.println(p3.precoComDesconto());

	}

}
