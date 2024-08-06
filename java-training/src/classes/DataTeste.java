package classes;

public class DataTeste {

	public static void main(String[] args) {

		Data d1 = new Data();
		d1.dia = 3;
		d1.mes = 9;
		d1.ano = 1987;
		
		var d2 = new Data();
		d2.dia = 25;
		d2.mes = 12;
		d2.ano = 2001;
		
		
		System.out.printf("Data: %d/%d/%d \n", d1.dia, d1.mes, d1.ano);
		System.out.printf("Data: %d/%d/%d", d2.dia, d2.mes, d2.ano);
	}
}
