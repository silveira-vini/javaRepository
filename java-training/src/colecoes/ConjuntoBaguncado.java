package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);  // double -> Double
		conjunto.add(true);  // boolean -> Boolean
		conjunto.add("Teste");  // String
		conjunto.add(1);     // int -> Integer
		conjunto.add("x");    // char -> Character
		System.out.println("Tamanha é " + conjunto.size());
		
		conjunto.add("teste");
		System.out.println("Tamanha é " + conjunto.size());

		System.out.println(conjunto.remove(2));   // retorna false se não achar
		System.out.println(conjunto.remove(1.2));  // retorna true se conseguir remover
		System.out.println("Tamanha é " + conjunto.size());
		
		
		System.out.println(conjunto.contains(1));
		
		
		Set nums = new HashSet();

		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		// conjunto.addAll(nums);    // união entre dois conjuntos
		
		conjunto.retainAll(nums);    // intercessão
		
		System.out.println(conjunto);
		
		conjunto.clear();
		
		System.out.println(conjunto);
		
		
	}
	
}
