package oo.cursoEmVideo.aula05;

public class ContaBanco {

	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;

	public ContaBanco(int numConta, String tipo, String dono) {
		this.numConta = numConta;
		this.tipo = tipo;
		this.dono = dono;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void abrirConta() {
		if (this.tipo == "cc") {
			System.out.println("Conta aberta com sucesso");
			this.saldo = 50.00;
		} else {
			System.out.println("Conta aberta com sucesso");
			this.saldo = 150.00;
		}
		this.status = true;
	}

	public void fecharConta() {
		if (saldo != 0) {
			System.out.println("Impossível encerrar a conta");
			System.out.println("Saldo diferente de zero");
			System.out.println("Saldo atual: R$ " + this.saldo);
		} else {
			this.status = false;
			System.out.println("Conta encerrada com sucesso");
		}
	}

	public void depositar(double deposito) {
		if (this.status == false) {
			System.out.println("Impossível depoisitar.");
			System.out.println("Conta fechada.");
		} else {
			this.saldo += deposito;
			System.out.println("Depósito realizado com sucesso");
		}

	}

	public void sacar(double saque) {
		if (this.status != true) {
			System.out.println("Impossível sacar.");
			System.out.println("Conta fechada.");
		} else if (this.saldo >= saque) {
			this.saldo -= saque;
			System.out.println("Saque realizado com sucesso");
		} else {
			System.out.println("Saldo insuficiente");
		}
	}

	public void pagarMensalidade() {

		if (this.tipo == "cc") {
			this.saldo -= 50.00;
			System.out.println("Mensalidade cobrada com sucesso");
		} else {
			this.saldo -= 20.00;
			System.out.println("Mensalidade cobrada com sucesso");
		}

	}

}
