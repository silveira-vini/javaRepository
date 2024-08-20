package oo.cursoEmVideo.aula06;

import java.lang.reflect.Method;

public abstract class ControleRemoto implements Controlador {

	private int volume;
	private boolean ligar;
	private boolean tocando;

	public ControleRemoto() {
		this.volume = 50;
		this.ligar = false;
		this.tocando = false;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isLigado() {
		return ligar;
	}

	public void setLigado(boolean ligar) {
		this.ligar = ligar;
	}

	public boolean isTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	public  Method ligar() {
		return null;
	}

	public Method desligar() {
		return null;
	}

	public Method abrirMenu() {
		return null;
	}

	public Method fecharMenu() {
		return null;
	}

	public Method aumentarVolume() {
		return null;
	}

	public Method abaixarVolume() {
		return null;
	}

	public Method mudo() {
		return null;
	}

	public Method mudoOff() {
		return null;
	}

	public Method play() {
		return null;
	}

	public Method pause() {
		return null;
	}

}
