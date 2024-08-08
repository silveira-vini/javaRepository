package classe;

public class DataTeste {

	public static void main(String[] args) {

		Data d1 = new Data();
				
		var d2 = new Data(25, 7, 1987);
		
		Data d3 = new Data();
		d3.dia = 7;
		
		System.out.println(d1.obterData());
		System.out.println(d2.obterData());
		System.out.println(d3.obterData());
	}
}
