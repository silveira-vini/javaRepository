package oo.cursoEmVideo.aula10;

public class Aluno extends Pessoa {

	private int matr;
	private String curso;
	
	public void cancelarMatr() {
		this.matr = 0;
		this.curso = "Não matriculado";
		
	}

	public int getMatr() {
		return matr;
	}

	public void setMatr(int matr) {
		this.matr = matr;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
