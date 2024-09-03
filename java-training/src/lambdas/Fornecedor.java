package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		
		
		Supplier<List<String>> umaLista = () -> Arrays.asList("Lia", "bia", "Gui", "Bob");
		
		System.out.println(umaLista.get());
		
		
		
		ArrayList<String> listaNomes = new ArrayList<String>(umaLista.get());
		
		listaNomes.addLast("vini");
		
		System.out.println(listaNomes);
		
		System.out.println(listaNomes.get(0));
		
	}
	
}
