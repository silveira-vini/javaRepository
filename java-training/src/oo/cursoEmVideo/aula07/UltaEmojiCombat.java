package oo.cursoEmVideo.aula07;

public class UltaEmojiCombat {

	public static void main(String[] args) {
		
// criando o vetor com 6 lutadores -------------
		Lutador[] l = new Lutador[6];
		
		
// inicializando os lutadores ------------------
		l[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 3, 1);
		l[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
		l[2] = new Lutador("Snapshadow", "USA", 35, 1.65, 80.9, 12, 2, 1);
		l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
		l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
		l[5] = new Lutador("Nerdaart", "USA", 30, 1.81, 105.7, 12, 2, 4);
		
		
		
// criando um objeto do tipo Luta -------------------------
		
		Luta UEC01 = new Luta();
		UEC01.marcarLuta(l[0], l[1]);
		UEC01.lutar();
		l[0].status();
		l[1].status();
		
	}
	
}
