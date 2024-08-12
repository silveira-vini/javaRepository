package classe;

public class EqualsHashcode {

	public static void main(String[] args) {

		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@ezemail.com";

		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@ezemail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		
		System.out.println(u1.nome.equals(u2.nome));
//		criou um método para ficar igual ao de cima:
		System.out.println(u1.equals(u2));
		
	}
}