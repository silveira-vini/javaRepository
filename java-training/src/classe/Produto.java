package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;

	Produto() {
	}

	double precoComDesconto() {
		return preco * (1 - desconto);
	}
}