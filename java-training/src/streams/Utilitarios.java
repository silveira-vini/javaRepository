package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {

	public final static UnaryOperator<String> maiuscula = a -> a.toUpperCase();
	public final static UnaryOperator<String> minuscula = a -> a.toLowerCase();
	public final static UnaryOperator<String> addExclamation = a -> a + "!!!";
	
	
}
