package oo.thiagoAguiar;

public class App {

	public static void main(String[] args) {

		User user1 = new User();
		user1.name = "Vinicius";
		user1.email = "vsribeiro87@gmail.com";
		user1.password = "Macaco.35";

		User user2 = new User();
		user2.name = "Fabiana";
		user2.email = "fabianadeassisbarbos@gmail.com";
		user2.password = "34341560";
		
		user1.login();
		user2.login();
	}

}
