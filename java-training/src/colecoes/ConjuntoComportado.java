package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		Set<String> listaAprovados = new HashSet<>();
		
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Lucas");
		listaAprovados.add("Pedro");
		listaAprovados.add("Fabio");
		
		for (String candidato : listaAprovados) {
			System.out.println(candidato);
		}
		

		Set<Integer> listaNotas = new HashSet<>();
		
		listaNotas.add(1);
		listaNotas.add(3);
		listaNotas.add(5);
		listaNotas.add(6);
		listaNotas.add(9);
		
	for (Integer nota : listaNotas) {
		System.out.println(nota);
	}
		
		
		
	}
	
}
