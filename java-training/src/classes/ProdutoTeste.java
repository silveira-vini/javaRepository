package classes;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto.desconto = 0.3; // LOCAL PARA ALTERAR O DESCONTO NA CLASSE

		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		System.out.printf("%s: R$ %.2f", p1.nome, p1.precoComDesconto());
	}

}
