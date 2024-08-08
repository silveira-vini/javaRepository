package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {

		// atribuição por valor (tipo primitivo);
		double a = 2;
		double b = a;

		a++;
		b--;

		System.out.println(a + " " + b);

		// atribuição por referência (tipo objeto);
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1;

		d1.dia = 31;
		d2.mes = 12;
		d2.ano = 1987;

		System.out.println(d1.obterData());
		System.out.println(d2.obterData());

		voltarDataParaValorPadrao(d1);

		System.out.println(d1.obterData());
		System.out.println(d2.obterData());
	
	}

	static void voltarDataParaValorPadrao(Data dataZero) {
		dataZero.dia = 1;
		dataZero.mes = 1;
		dataZero.ano = 1970;

	}
	


}
