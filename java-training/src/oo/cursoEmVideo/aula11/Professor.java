package oo.cursoEmVideo.aula11;

public class Professor {

	private String especialidade;
	private double salario;
	
	public void receberAumento(double aumento) {
		this.salario += aumento;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
