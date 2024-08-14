package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {

		ArrayList<Usuario> lista = new ArrayList<>();

		Usuario u1 = new Usuario("Ana");
		lista.add(u1);

		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3));   // acessar pelo índice
		
		lista.remove(1);
		lista.remove(new Usuario("Bia"));
		
		System.out.println(lista.contains(new Usuario("Lia")));
		
		for (Usuario usuario : lista) {
			System.out.println(usuario);   
		}

	}

}
