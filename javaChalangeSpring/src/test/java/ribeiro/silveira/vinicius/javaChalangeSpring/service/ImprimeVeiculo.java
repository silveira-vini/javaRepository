package ribeiro.silveira.vinicius.javaChalangeSpring.service;

import org.json.JSONObject;

public class ImprimeVeiculo {

    public void imprimeVeiculo(String jsonResponseModelo) {
        try {
            // Converte a string JSON para um objeto JSONObject
            JSONObject jsonObject = new JSONObject(jsonResponseModelo);

            // Extrai os valores do objeto JSON
            int tipoVeiculo = jsonObject.getInt("TipoVeiculo");
            String valor = jsonObject.getString("Valor");
            String marca = jsonObject.getString("Marca");
            String modelo = jsonObject.getString("Modelo");
            int anoModelo = jsonObject.getInt("AnoModelo");
            String combustivel = jsonObject.getString("Combustivel");
            String codigoFipe = jsonObject.getString("CodigoFipe");
            String mesReferencia = jsonObject.getString("MesReferencia");
            String siglaCombustivel = jsonObject.getString("SiglaCombustivel");

            // Imprime os dados do veículo
            System.out.println("Tipo de Veículo: " + tipoVeiculo);
            System.out.println("Valor: " + valor);
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Ano do Modelo: " + anoModelo);
            System.out.println("Combustível: " + combustivel);
            System.out.println("Código Fipe: " + codigoFipe);
            System.out.println("Mês de Referência: " + mesReferencia);
            System.out.println("Sigla do Combustível: " + siglaCombustivel);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}