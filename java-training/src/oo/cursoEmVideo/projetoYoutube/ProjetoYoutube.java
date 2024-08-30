package oo.cursoEmVideo.projetoYoutube;

public class ProjetoYoutube {

	public static void main(String[] args) {

		Video v[] = new Video[3];
		v[0] = new Video("E o vento levou");
		v[1] = new Video("Titanic");
		v[2] = new Video("Velozes e furiosos");

	//	for (int i = 0; i < v.length; i++) {
	//		System.out.println(v[i].toString());
	//	}

		Gafanhoto g[] = new Gafanhoto[3];
		g[0] = new Gafanhoto("Vinicius", 36, "M", "vinicius.ribeiro");
		g[1] = new Gafanhoto("Fabiana", 31, "F", "fabiana.barbosa");
		g[2] = new Gafanhoto("Roberto", 29, "M", "roberto.pereira");

	//	for (int i = 0; i < g.length; i++) {
	//		System.out.println(g[i].toString());
	//	}
		
		
		
		
		Visualizacao v1 = new Visualizacao(g[0], v[0]);
		
		v1.avaliar();
		v1.avaliar(0.85);
		v1.avaliar(95);
		System.out.println(v1.toString());
		
		
		

	}

}
