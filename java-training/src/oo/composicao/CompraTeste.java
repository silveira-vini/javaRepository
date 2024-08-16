package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {

		Compra compra1 = new Compra();
		compra1.cliente = "Rafael";
		compra1.lista.add(new Item("borracha", 3, 1.98));
		compra1.lista.add(new Item("lapis", 5, 2.54));
		compra1.lista.add(new Item("tesoura", 1, 15.98));

		System.out.println(compra1.lista.size());

		System.out.println(compra1.lista.getLast().descricao);

		System.out.printf("Valor total: R$%.2f", compra1.valorTotal());

	}

}
