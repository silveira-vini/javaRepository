package generics;

import java.util.List;

public class ListaUtil {

	public static <T> T getUltimo(List<T> lista) {
		return lista.get(lista.size() - 1);
	}

	
	
}
