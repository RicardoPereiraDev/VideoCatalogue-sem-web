package br.com.alura.VideoCatalogue.Service;

public interface IConverteDados {

 <T> T  obterDados(String json, Class<T>classe);
}


//Notas finais, utiliza se esse T para dizermos que não sabemos que tipo é mas sabemosque vai ser generico, ou seja, eu não sei quais os dados que vão ser devolvidos mas sei que vai ter que ser devolvida alguma coisa.

/* O T quer dizer que ainda não sabemos qual a entidade que vai ser devolvida, sei que vai ter que ser devolvida alguma coisa

 Quando eu chamar o obter dados, dizer qual é o tipo de retorno que eu quero, por exemplo vou passar um json para uma serie e eu quero que me devolve aqui um dados serie.

   Já posso dizer qual é a classe que possa ser devolvida

   Conclusão: IConverteDados vai receber um json que é uma String, vai receber uma classe, e lá no converterDados eu vou tentar
   transformar esse json na classe que for indicada.
   */