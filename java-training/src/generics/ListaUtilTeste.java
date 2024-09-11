package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {

		List<String> langs = Arrays.asList("JS", "PHP", "JAVA", "Kotlin");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

		String lastLang = ListaUtil.getUltimo(langs);
		System.out.println(lastLang);

		Integer lastNum = ListaUtil.getUltimo(nums);
		System.out.println(lastNum);

	}

}
