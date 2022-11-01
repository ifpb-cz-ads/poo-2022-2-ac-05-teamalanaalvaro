/**
 * Atividade Prática do Livro Chagas, Baruque & Baruque (2010): questão 3 página 110.
 */
public class CBBAtividadePratica3
{
   public static void main(String[] args){
       String frase1;
       String frase2;
       frase1 = new String("Testando igualdade!");
       frase2 = new String("Testando igualdade!");
       
       System.out.println("Frase 1: "+ frase1);
       System.out.println("Frase 2: "+ frase2);
       System.out.println("Frase 1 e Frase 2 possuem o mesmo conteudo? \nR: "+(frase1.equals(frase2)));
       
       /**
        * O operador de igualdade(==) as vezes eles não conseguem verificar se os objetos possuem os mesmo conteúdos,
        * apenas se possuem a mesma referência em memória. Já para comparar o conteudo dos objetos e ter certeza,usa-se
        * o método equals(), como se fosse analisar o conteúdo do objeto exatamente igual a outro;
        */
   }
}
