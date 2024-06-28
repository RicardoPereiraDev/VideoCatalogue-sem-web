package br.com.alura.VideoCatalogue.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//Aqui em baixo temos o mapeamento de como vai ficar lá do json para a minha classe, só que aquele processo de conversão que faziamos lá no GSON que é o fromJson ou toJson do Json e agora vou ter que implementar isso

@JsonIgnoreProperties(ignoreUnknown = true) // Isto quer dizer que tudo o que não for Title, totalSeasons ou imdbRating, não vai mais converter.
public record DadosSerie(@JsonAlias("Title") String Titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao) {


}


//Notas finais:

/* Não conseguimos transformar title(que vem do atributo da API) em titulo magicamente, nós p+recisamos de dizer
que esse title precisa de vir para um Titulo, como se fosse um apelido.
Do tipo, olha vai ter um apelido lá chamado title e vai depois trazer aqui para o titulo
 */