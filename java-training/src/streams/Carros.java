package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Carros {

	public static void main(String[] args) {

		Carro c1 = new Carro("GM", "Onix", 5, 95, 145);
		Carro c2 = new Carro("Fiat", "Mobi", 3, 65, 110);
		Carro c3 = new Carro("Volkswagem", "Up", 4, 95, 120);
		Carro c4 = new Carro("Renault", "Sandero", 5, 110, 140);
		Carro c5 = new Carro("Citroen", "C4 Palas", 5, 120, 150);

		List<Carro> cars = Arrays.asList(c1, c2, c3, c4, c5);

		Consumer<String> print = System.out::println;
		Predicate<Carro> isPotente = a -> a.getPotencia() >= 90;
		Predicate<Carro> maisDeCinco = a -> a.getOcupantes() >=5;
		Function<Carro, String> relVelPot = a -> a.getMarca() + " " + a.getModelo() 
			+ ":\n  Relação Velocidade / Potência: " 
			+ String.format("%.2f", (a.getVelocidadeMaxima() / a.getPotencia()));
		
		cars.stream()
		.filter(isPotente)
		.filter(maisDeCinco)
		.map(relVelPot)
		.forEach(print);
		
	}

}
