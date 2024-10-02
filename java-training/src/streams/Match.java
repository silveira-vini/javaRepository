package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Vini", 4.5);
		Aluno a2 = new Aluno("Fabi", 8.5);
		Aluno a3 = new Aluno("Lola", 7.3);
		Aluno a4 = new Aluno("Prin", 6.5);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

		Predicate<Aluno> aprovado = a -> a.nota >= 6;
		Predicate<Aluno> reprovado = aprovado.negate();
		
		
		System.out.println(alunos.stream().allMatch(aprovado));
		System.out.println(alunos.stream().allMatch(reprovado));
		System.out.println(alunos.stream().anyMatch(aprovado));
		System.out.println(alunos.stream().anyMatch(reprovado));
		System.out.println(alunos.stream().noneMatch(aprovado));
		System.out.println(alunos.stream().noneMatch(reprovado));
	}
	
}
