package br.com.alura.VideoCatalogue.Service;

import br.com.alura.VideoCatalogue.model.DadosSerie;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteDados implements IConverteDados {

    private  ObjectMapper mapper = new ObjectMapper();


    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        //Aqui o que eu vou devolver é uma instancia generica e ai precisamos de ler o valor lá no json;
        //Vou chamar mapper que é o objecto do Jackson que faz a conversão, lê esse json para mim e tenta transformar na classe que a pessoa passou;
        try {
            return mapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}




//Notas Finais:

/* Lá no GSON, usava-se o toJson e o FromJson,
Aqui no Jackson vaos ter que utilizar o ObjectMapper */