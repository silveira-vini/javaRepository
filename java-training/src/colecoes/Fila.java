package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// .add & .offer -> ambos adicionam elementos na fila
		fila.add("Ana");   // se cheio, lança uma exceção
		fila.offer("Bia");  // se cheio, retorna false
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		// .peek & .element -> obtem o próximo da fila, sem remover
		System.out.println(fila.peek());      // se vazio, retorna false
		System.out.println(fila.element());  // se vazio, lança uma exceção
		
		
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());  // se vazio, retorna false
		
		System.out.println("");
		for (String nome : fila) {
			System.out.println(nome);
		}
		
		fila.remove("Gui");   // se vazio, retorna uma exceção
		
		System.out.println("");
		for (String nome : fila) {
			System.out.println(nome);
		}
		
		
		// OUTROS MÉTODOS IMPORTANTES:
		//		fila.clear();
		//		fila.size();
		//		fila.isEmpty();
		//		fila.contains(...);
		
		
		
	}
	
}
