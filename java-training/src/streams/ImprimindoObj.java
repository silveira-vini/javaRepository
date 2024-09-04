package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObj {
 
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu", "Vini", "Fabi", "Tonho");
		
		System.out.println("Usando o forEach:");
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nUsando o Iterator:");
		Iterator<String> it = aprovados.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\nUsando Stream:");
		Stream<String> st = aprovados.stream();
		st.forEach(System.out::println);  // laço interno.
		
	}
	
}
