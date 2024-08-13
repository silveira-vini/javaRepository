package classe;

public class EqualsYT {

	public static void main(String[] args) {
		
		Dog myDog = new Dog();
		Dog yourDog = new Dog();
		
		myDog.name = "Lola";
		yourDog.name = "Lola";
		
		if (myDog.equals(yourDog)) {
			System.out.println("The dogs are equal");
		} else {
			System.out.println("The dogs are not equal");
		}
		
		
		
	}
	
}
