/**
 * Atividade Prática do Livro Chagas, Baruque & Baruque (2010): questão 4 página 116.
 */
public class RegistraAluno{
    private String nome;
    private String endereco;
    private int idade;
    private double notaMatematica;
    private double notaPortugues;
    private double notaGeografia;
    
    public static int contadorEstudante;
    
    //retorna nome do estudante
    public String getNome(){
        return nome;
    }
    //define ou altera o nome do estudante
    public void setNome(String temp){
        nome = temp;
    }
    //retorna o endereço do estudante
    public String getEndereco(){
        return endereco;
    }
    //define ou altera o endereço do estudante
    public void setEndereco(String temp){
        endereco = temp;
    }
    //retorna a idade do estudante
    public int getIdade(){
        return idade;
    }
    //define ou altera idade do estudante
    public void setEndereco(int temp){
        idade = temp;
    }
    //define ou altera as notas
    public void setNotaMatematica(double temp){
        notaMatematica = temp;
    }
    public void setNotaPortugues(double temp){
        notaPortugues = temp;
    }
    public void setNotaGeografia(double temp){
        notaGeografia = temp;
    }
    //retorna a media do estudante
    public double getMedia(){
        double resultado = 0;
        resultado = (notaMatematica + notaPortugues + notaGeografia) / 3;
        return resultado;
    }
    //retorna a quantidade de estudantes cadastrados
    public static int getQuantidadeAlunos(){
        return contadorEstudante;
    }
}

