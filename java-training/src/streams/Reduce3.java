package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Vini", 4.5);
		Aluno a2 = new Aluno("Fabi", 8.5);
		Aluno a3 = new Aluno("Lola", 7.3);
		Aluno a4 = new Aluno("Prin", 6.5);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

		Predicate<Aluno> aprovado = a -> a.nota >= 6;
		Function<Aluno, Double> apenasNota = a -> a.nota;

	}

}
