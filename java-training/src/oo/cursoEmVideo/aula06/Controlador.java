package oo.cursoEmVideo.aula06;

import java.lang.reflect.Method;

public interface Controlador {

	public abstract Method ligar();
	public abstract Method desligar();
	public abstract Method abrirMenu();
	public abstract Method closeMenu();
	public abstract Method aumentarVolume();
	public abstract Method abaixarVolume();
	public abstract Method mudo();
	public abstract Method mudoOff();
	public abstract Method play();
	public abstract Method pause();
	
	
}
