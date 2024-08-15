package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {

		Map<Integer, String> usuarios = new HashMap<>();

		usuarios.put(2, "Roberto");
		usuarios.put(1, "Vanessa");
		usuarios.put(4, "João");
		usuarios.put(3, "Carlos");

		System.out.println(usuarios.size());
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		System.out.println(usuarios.containsKey(3));
		System.out.println(usuarios.containsValue("Carlos"));
		System.out.println(usuarios.get(4));
		System.out.println(usuarios.remove(3));

		for (int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for (String nome : usuarios.values()) {
			System.out.println(nome);
		}
		
		for (Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.println(registro);
		}
	}

}
