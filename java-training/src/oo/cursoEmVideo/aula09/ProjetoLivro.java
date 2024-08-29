package oo.cursoEmVideo.aula09;

public class ProjetoLivro {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Vinicius", "Masculino", 36);
		Pessoa p2 = new Pessoa("Fabiana", "Feminino", 32);
		
		Livro l1 = new Livro("Don Casmurro", "Machado de Assis", 435, p2);
		Livro l2 = new Livro("Quincas Borba", "Carlos Drumond", 250, p1);
		
		l1.detalhes();
		l1.abrir();
		l1.avancarPag();
		l1.avancarPag();
		l1.detalhes();
		l1.folhear(150);
		l1.detalhes();
		l1.folhear(500);
		l1.detalhes();
		l1.fechar();
		l1.detalhes();
		
		l2.detalhes();
		l2.abrir();
		l2.avancarPag();
		l2.avancarPag();
		l2.avancarPag();
		l2.avancarPag();
		l2.voltarPag();
		l2.detalhes();
		
		
		
	}
}
