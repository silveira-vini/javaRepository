package oo.thiagoAguiar;

public class User {

	String name;
	String email;
	String password;
	
	public void login() {
		System.out.println("Usuário: " + this.name);
		System.out.println("Voce logou com o login " + this.email 
							+ " e senha " + this.password);
	}
	
}
