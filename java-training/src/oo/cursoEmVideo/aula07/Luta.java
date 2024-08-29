package oo.cursoEmVideo.aula07;

import java.util.Random;

public class Luta {

	// Atributos ----------------
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;

	// Métodos públicos --------------------
	public void marcarLuta(Lutador l1, Lutador l2) {
		if ((l1.getCategoria().equals(l2.getCategoria())) && !(l1.equals(l2))) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
			System.out.println("Luta Aprovada");
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
			System.out.println("Luta não Aprovada");
		}

	}

	public void lutar() {
		if (this.aprovada) {
			this.desafiado.apresentar();
			this.desafiante.apresentar();
			System.out.println(" ");
			System.out.println("---------------LUTANDO...-------------------");
			Random aleatorio = new Random();
			switch (aleatorio.nextInt(3)) {
			case 0: // empate
				System.out.println("Empatou");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			case 1: // desafiado vence
				System.out.println("O lutador " + this.desafiado.getNome() + " ganhou");
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 2: // desafiando vence
				System.out.println("O lutador " + this.desafiante.getNome() + " ganhou");
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();
				break;
			}

		} else {
			System.out.println("Luta não pode acontecer");
		}

	}

	// Getters e Setters ------------------

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

}
