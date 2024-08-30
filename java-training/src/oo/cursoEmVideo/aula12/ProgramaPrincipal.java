package oo.cursoEmVideo.aula12;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Mamifero m1 = new Mamifero();
		Peixe p1 = new Peixe();
		
		
		m1.setPeso(85.3);
		m1.setIdade(2);
		m1.setMembros(4);
		m1.setCorDoPelo("azul");
		System.out.println(m1.toString());
		m1.locomover();
		m1.alimentar();
		m1.emitirSom();
		System.out.println(m1.getCorDoPelo());
		
		p1.setPeso(0.35);
		p1.setIdade(1);
		p1.setMembros(0);
		p1.locomover();
		p1.alimentar();
		p1.emitirSom();
		
		
		Canguru c1 = new Canguru();
		c1.locomover();
		c1.setCorDoPelo("Marrom");
		System.out.println(c1.getCorDoPelo());
		System.out.println(m1.getCorDoPelo());
		
		Cachorro dog1 = new Cachorro();
		dog1.locomover();
		dog1.enterrarOsso();
		dog1.emitirSom();
	}

}
