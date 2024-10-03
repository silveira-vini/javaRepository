package br.com.alura.screenmatch.service.tradutor;

import br.com.alura.screenmatch.service.ConsumoApi;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URLEncoder;

public class ConsultaMyMemory {
    public static String obterTraducao(String text) {
        ObjectMapper mapper = new ObjectMapper();
        ConsumoApi consumoApi = new ConsumoApi();

        String texto = URLEncoder.encode(text);
        String langpair = URLEncoder.encode("autodetect|pt-br");

        String url = "https://api.mymemory.translated.net/get?q=" + texto +  "&langpair=" + langpair;
        String json = consumoApi.obterDados(url);

        DadosTraducao traducao;
        try {
            traducao = mapper.readValue(json, DadosTraducao.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        return traducao.dadosResposta().translatedText;

    }
}
