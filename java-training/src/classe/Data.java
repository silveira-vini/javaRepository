package classe;

public class Data {

	int dia;
	int mes;
	int ano;

	Data() {
		this(1, 1, 1970);
	}

	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String obterData() {
		final String formato = "%d/%d/%d";
		return String.format(formato, this.dia, this.mes, this.ano);
	}

}
