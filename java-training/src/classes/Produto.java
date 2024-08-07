package classes;

public class Produto {

	String nome;
	double preco;
	double desconto;

// CONSTRUTORES
	Produto() {
	}

	Produto(String nomeInicial) {
		nome = nomeInicial;
	}

	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}

	Produto(String nomeInicial, double precoInicial, double descontoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
//-------------------------------------

	// MÉTODOS
	double precoComDesconto() {
		return preco * (1 - desconto);
	}

	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - (desconto + descontoDoGerente));
	}
//----------------------------------
}
