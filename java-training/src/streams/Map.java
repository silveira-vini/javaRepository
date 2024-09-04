package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Map {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW", " Audi", " Honda");
		
				
		marcas.stream().map(Utilitarios.maiuscula).forEach(print);
		System.out.println("");
		marcas.stream().map(Utilitarios.minuscula).map(Utilitarios.addExclamation).forEach(print);;
	}
	
}
