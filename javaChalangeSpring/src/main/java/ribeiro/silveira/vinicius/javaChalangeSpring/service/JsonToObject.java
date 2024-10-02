package ribeiro.silveira.vinicius.javaChalangeSpring.service;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

public class JsonToObject {
    private final ObjectMapper objectMapper = new ObjectMapper();

    public <T> List<T> obterDados(String json, Class<T> classe) {
        try {
            return objectMapper.readValue(json, objectMapper.getTypeFactory().constructCollectionType(List.class, classe));
        } catch (IOException e) {
            throw new RuntimeException("Erro ao desserializar JSON", e);
        }
    }
}
