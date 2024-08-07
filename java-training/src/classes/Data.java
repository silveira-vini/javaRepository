package classes;

public class Data {

	int dia;
	int mes;
	int ano;
	
	String obterData() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}

	void imprimirData() {
		System.out.println(obterData());
	}
	
}
