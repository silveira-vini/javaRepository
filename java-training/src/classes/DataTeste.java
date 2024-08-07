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
		
		
		System.out.println(d1.obterData());
		System.out.println(d2.obterData());
		d1.imprimirData();
		d2.imprimirData();
	}
}
