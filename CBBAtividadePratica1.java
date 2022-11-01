/**
   Atividade Prática do Livro Chagas, Baruque & Baruque (2010): questão 1 página 108. 
 */
public class CBBAtividadePratica1
{
   public static void main(String[] args){
           String frase1;
           String frase2;
           frase1 = new String("Testando igualdade!");
           frase2 = new String("Testando igualdade!");
           
           System.out.println("Frase 1: "+frase1);
           System.out.println("Frase 2: "+frase2);
           System.out.println("Frase 1 e Frase 2 são iguais? \nR: "+ (frase1==frase2));
           
           /**
            * A string frase1 e frase2 tem o mesmo valor, porém quando se compara retorna uma valor diferente
            * pois tem referências diferentes, ou seja, porque foi construído um objeto para cada String, um "new"
            para cada atributo frase.
            * **/
   }
}
