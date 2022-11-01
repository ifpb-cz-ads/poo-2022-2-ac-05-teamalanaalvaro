
/**
 * Atividade Prática do Livro Chagas, Baruque & Baruque (2010): questão 2 página 109.
 */
public class CBBAtividadePratica2
{
    public static void main(String[] args){
        String frase3;
        String frase4;
        frase3 = new String("Testando igualdade!");
        frase4 = frase3;
        
        System.out.println("Frase 3: "+ frase3);
        System.out.println("Frase 4: "+ frase4);
        System.out.println("Frase 3 e Frase 4 possuem a mesma referencia? \nR: "+(frase3==frase4));
        
        /**
         * Neste exemplo, ao invés de criar um construtor para a frase4 apenas atribuímos a frase3 a ela,ou seja,
         * ela recebe seu valor como referência - como ela tem mesmo valor entao quando for imprimir terão valores iguais. 
         */
    }
}
