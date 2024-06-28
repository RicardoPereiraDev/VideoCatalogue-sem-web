package br.com.alura.VideoCatalogue;

import br.com.alura.VideoCatalogue.Service.ConsumoAPI;
import br.com.alura.VideoCatalogue.Service.ConverteDados;
import br.com.alura.VideoCatalogue.model.DadosSerie;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //Isto será uma aplicação de linha de comando
public class VideoCatalogueApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(VideoCatalogueApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//System.out.println("Primeiro projecto Spring sem Web");

		var consumoAPI = new ConsumoAPI();

		//Então o meu json vai ser o quê? da onde vêm essa informação? vou ter que ir lá no meu consumoApi.obterDados() e ai ele vai devolver uma string que eu estou passando para a variavel json
		var json = consumoAPI.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=21d3c381");

		//json= consumoAPI.obterDados("https://www.ebay.co.uk/itm/163695062831?chn=ps&_ul=GB&var=463181961037&norover=1&mkevt=1&mkrid=710-170020-479971-5&mkcid=2&itemid=463181961037_163695062831&targetid=293946777986&device=c&mktype=pla&googleloc=20878&poi=&campaignid=20787991651&mkgroupid=157350414842&rlsatarget=pla-293946777986&abcId=&merchantid=10084864&gad_source=1&gclid=CjwKCAjw1emzBhB8EiwAHwZZxXz0FTw2M7AQxA6urMgskH-1TXpSEX4FL3-lQ8BvAVBtt-SjbJ1zjBoCehkQAvD_BwE");

		System.out.println(json);
		ConverteDados conversor = new ConverteDados();

		//Agora quero representar como uns dados serie, então em infra vou ter que fazer o seguinte o codigo:
		//Agora vou dizer conversor vou passar aquele json que obtive e quero que vc converta para DadosSerie.class
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);

		//E agora no codigo infra vamos ver se esses dados vão estar representados do jeito que é o toString daquele record mostrando lá os dados da serie
		System.out.println(dados);
	}
}

//Notas finais:

/*
Resumo do codigo supra, primeiro tem o consumo da API, vou no consumo API e obtenho dados aqui da serie gilmore girls e atribuo para a variavel json, depois
imprimo essa variavel json para confirmar que os dados vieram ok, depois instancio um conversor e mando ele transformar para dados serie e imprime os dados da serie.

  */