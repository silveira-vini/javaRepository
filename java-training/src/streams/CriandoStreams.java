package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {

		Consumer<String> print = System.out::print;

		Stream<String> langs = Stream.of("Java ", "Lua ", "JS \n");
		langs.forEach(print);

		String[] maisLangs = { "Python ", "Lisp ", "Perl\n ", "GO\n" };
		Stream.of(maisLangs).forEach(print);

		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 3).forEach(print); // do índice 1 ao 3, excluindo o 3

		List<String> outrasLangs = Arrays.asList(" C ", " PHP ", " Kotlin ");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
		
		
		
	}

}
