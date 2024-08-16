package oo.composicao;

import java.util.ArrayList;

public class Compra {

	String cliente;

	ArrayList<Item> lista = new ArrayList<Item>();

	double valorTotal() {
		double total = 0;
		for (Item item : lista) {
			total += item.valor * item.qnde;
		}

		return total;

	}
}
