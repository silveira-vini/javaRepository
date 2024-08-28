package oo.cursoEmVideo.aula06;

public class ControleRemoto implements Controlador {

	private int volume;
	private boolean ligado;
	private boolean tocando;

	public ControleRemoto() {
		this.volume = 5;
		this.ligado = false;
		this.tocando = false;
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	@Override
	public void ligar() {
		this.setLigado(true);
		System.out.println("TV Ligada");
	}

	@Override
	public void desligar() {
		this.setLigado(false);
		System.out.println("Desligando TV...");
	}

	@Override
	public void abrirMenu() {
		System.out.println("----MENU----");
		System.out.println("Está ligado: " + this.getLigado());
		System.out.println("Está tocando: " + this.getTocando());
		System.out.print("Volume: " + this.getVolume());
		for (int i = 0; i < this.getVolume(); i++) {
			System.out.print("|");
		}
		System.out.println("");
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando Menu...");
	}

	@Override
	public void maisVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() + 1);
			System.out.println("Volume: " + this.getVolume());
		}
	}

	@Override
	public void menosVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() - 1);
			System.out.println("Volume: " + this.getVolume());
		}
	}

	@Override
	public void ligarMudo() {

		if (this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
			System.out.println("MUDO");
		}
	}

	@Override
	public void desligarMudo() {
		if (this.getLigado() == true && this.getVolume() == 0) {
			this.setVolume(5);
			System.out.println("Volume: " + this.getVolume());
		}
	}

	@Override
	public void play() {
		if (this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
			System.out.println("Tocando...");
		}
	}

	@Override
	public void pause() {

		if (this.getLigado() && this.getTocando()) {
			this.setTocando(false);
			System.out.println("Pause");
		}
	}
}
