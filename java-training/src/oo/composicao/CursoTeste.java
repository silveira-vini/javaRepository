package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Fabio");
		Aluno aluno3 = new Aluno("Fátima");
		Aluno aluno4 = new Aluno("Judith");

		Curso java = new Curso("Java");
		Curso php = new Curso("PHP");

		aluno1.adicionarCurso(java);
		aluno1.adicionarCurso(php);

		php.adicionarAluno(aluno4);
		php.adicionarAluno(aluno3);

		java.adicionarAluno(aluno2);
		java.adicionarAluno(aluno4);

		System.out.println("Curso Java:");
		for (Aluno aluno : java.alunos) {
			System.out.println(aluno.nome);
		}
		System.out.println();
		
		System.out.println("Curso PHP:");
		for (Aluno aluno : php.alunos) {
			System.out.println(aluno.nome);
		}
		System.out.println();
		
		System.out.println("Cursos do João:");
		for (Curso curso : aluno1.cursos) {
			System.out.println(curso.nome);
		}
		System.out.println();
		
		System.out.println("Cursos do Fábio:");
		for (Curso curso : aluno2.cursos) {
			System.out.println(curso.nome);
		}
		System.out.println();
		
		System.out.println("Cursos do Fátima:");
		for (Curso curso : aluno3.cursos) {
			System.out.println(curso.nome);
		}
		System.out.println();
		
		System.out.println("Cursos do Judith:");
		for (Curso curso : aluno4.cursos) {
			System.out.println(curso.nome);
		}
		System.out.println();
		
		System.out.println(java.alunos);
		System.out.println(aluno1.cursos);
		
	}

}
