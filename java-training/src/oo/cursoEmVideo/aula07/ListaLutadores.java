package oo.cursoEmVideo.aula07;

public class ListaLutadores {

	public static void main(String[] args) {
		
		// criando o vetor com 6 lutadores -------------
		Lutador[] lutadores = new Lutador[5];
		
		
		// inicializando os lutadores ----------
		lutadores[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 3, 1);
		lutadores[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
		lutadores[2] = new Lutador("Snapshadow", "USA", 35, 1.65, 80.9, 12, 2, 1);
		
		
		
	// chamando os métodos ----
		
		lutadores[0].apresentar();
	}
	
}
