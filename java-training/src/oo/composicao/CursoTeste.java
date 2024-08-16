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
		
		for (Aluno aluno : java.alunos) {
			System.out.println(aluno.nome);
			
		}

		for (Aluno aluno : php.alunos) {
			System.out.println(aluno.nome);
			
		}
		
		for (Curso curso : aluno1.cursos) {
			System.out.println(curso.nome);
		}

	}

}
