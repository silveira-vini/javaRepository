package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Pedro", 4.6);
		Aluno a3 = new Aluno("Fabi", 6.0);
		Aluno a4 = new Aluno("Vini", 9.0);
		Aluno a5 = new Aluno("Romulo", 9.5);
		Aluno a6 = new Aluno("Rachel", 10.0);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

		Consumer<String> print = System.out::println;
		Predicate<Aluno> isAprovado = a -> a.nota >= 7;
		Function<Aluno, String> nome = a -> "Parabéns " + a.nome + ". Você está aprovado";

		alunos.stream().filter(isAprovado).map(nome).forEach(print);

	}

}
