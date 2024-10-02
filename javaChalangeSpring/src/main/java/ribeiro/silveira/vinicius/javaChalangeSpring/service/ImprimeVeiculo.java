package ribeiro.silveira.vinicius.javaChalangeSpring.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ImprimeVeiculo {
    @JsonIgnoreProperties(ignoreUnknown = true)
    private static class Veiculo {
        @JsonProperty("Valor")
        private String valor;
        @JsonProperty("Marca")
        private String marca;
        @JsonProperty("Modelo")
        private String modelo;
        @JsonProperty("AnoModelo")
        private int anoModelo;
        @JsonProperty("Combustivel")
        private String combustivel;

        // Getters
        public String getValor() {return valor;}
        public String getMarca() {return marca;}
        public String getModelo() {return modelo;}
        public int getAnoModelo() {return anoModelo;}
        public String getCombustivel() {return combustivel;}
    }

    public void imprimeVeiculo(String jsonResponseModelo) {
        try {
            // Cria um objeto ObjectMapper
            ObjectMapper objectMapper = new ObjectMapper();
            // Converte a string JSON para um objeto Veiculo
            Veiculo veiculo = objectMapper.readValue(jsonResponseModelo, Veiculo.class);
            // Imprime os dados do veículo
            System.out.println("Valor: " + veiculo.getValor());
            System.out.println("Marca: " + veiculo.getMarca());
            System.out.println("Modelo: " + veiculo.getModelo());
            System.out.println("Ano do Modelo: " + veiculo.getAnoModelo());
            System.out.println("Combustível: " + veiculo.getCombustivel());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}