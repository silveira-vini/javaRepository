package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<>();

		livros.add("O pequeno príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");

		System.out.println(livros.peek());
		System.out.println(livros.element());

		System.out.println(livros.poll());
		System.out.println(livros.remove());
		System.out.println(livros.pop());

		System.out.println(livros.size());
		livros.clear();
		livros.contains(livros);
		livros.isEmpty();
		
	}

}
