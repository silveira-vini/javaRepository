
package ribeiro.silveira.vinicius.javaChalangeSpring.main;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import ribeiro.silveira.vinicius.javaChalangeSpring.model.DadosAno;
import ribeiro.silveira.vinicius.javaChalangeSpring.model.Marcas;
import ribeiro.silveira.vinicius.javaChalangeSpring.model.Modelos;
import ribeiro.silveira.vinicius.javaChalangeSpring.service.ConsumeAPI;
import ribeiro.silveira.vinicius.javaChalangeSpring.service.ImprimeVeiculo;
import ribeiro.silveira.vinicius.javaChalangeSpring.service.JsonToObject;
import ribeiro.silveira.vinicius.javaChalangeSpring.service.ObterVeiculo;

import java.util.List;

public class Principal {
    private static final String URL_BASE = "https://parallelum.com.br/fipe/api/v1/";
    private static final String ENDPOINT_MARCAS = "/marcas/";
    private static final String ENDPOINT_MODELOS = "/modelos/";
    private static final String ENDPOINT_ANOS = "/anos/";
    private final ConsumeAPI apiConsumer = new ConsumeAPI();
    private final JsonToObject jsonToObject = new JsonToObject();
    private final ObterVeiculo obterVeiculo = new ObterVeiculo();
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final ImprimeVeiculo imprimeVeiculo = new ImprimeVeiculo();


    public void buscarVeiculo() throws JsonProcessingException {
        // Buscar marcas;
        String tipoVeiculo = obterVeiculo.obterTipoVeiculo();
        String urlMarcas = URL_BASE + tipoVeiculo + ENDPOINT_MARCAS;
        String jsonResponseMarcas = apiConsumer.buscarJson(urlMarcas);
        List<Marcas> marcas = jsonToObject.obterDados(jsonResponseMarcas, Marcas.class);
        marcas.forEach(System.out::println);

        // Buscar modelos da marca selecionada;
        int marcaVeiculo = obterVeiculo.obterMarcaVeiculo();
        String urlModelos = urlMarcas + marcaVeiculo + ENDPOINT_MODELOS;
        String jsonResponseModelos = apiConsumer.buscarJson(urlModelos);

        // Acessar a propriedade "modelos" do JSON
        JsonNode rootNode = objectMapper.readTree(jsonResponseModelos);
        JsonNode modelosNode = rootNode.get("modelos");

        // Desserializar o array de modelos;
        List<Modelos> modelos = objectMapper.readValue(modelosNode.toString(),
                objectMapper.getTypeFactory().constructCollectionType(List.class, Modelos.class));
        modelos.forEach(System.out::println);

        // Buscar anos do modelo selecionado;
        int modeloVeiculo = obterVeiculo.obterModeloVeiculo();
        String urlAnos = urlModelos + modeloVeiculo + ENDPOINT_ANOS;
        String jsonResponseAnos = apiConsumer.buscarJson(urlAnos);
        List<DadosAno> anos = jsonToObject.obterDados(jsonResponseAnos, DadosAno.class);
        anos.forEach(System.out::println);

        // Buscar modelo/ano especificado e imprimir:
        String anoModeloVeiculo = obterVeiculo.obterAnoModeloVeiculo();
        String urlAnoModelo = urlAnos + anoModeloVeiculo;
        String jsonResponseAnoModelo = apiConsumer.buscarJson(urlAnoModelo);
        imprimeVeiculo.imprimeVeiculo(jsonResponseAnoModelo);

    }
}