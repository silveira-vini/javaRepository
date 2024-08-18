package oo.thiagoAguiar;

public class User {

	// PROPRIEDADES
	private String firstName;
	private String lastName;
	
	
	// CONSTRUTORES
	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	// MÉTODOS SETTERS & GETTERS:
	// SETTER
	public void setFullName(String firstName, String lastName) {
		this.firstName = firstName.toUpperCase();
		this.lastName = lastName.toUpperCase();
	}
	
	// GETTER
	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}
}
