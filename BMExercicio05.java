public class BMExercicio05 {

    private int vitorias = 0;
    private int derrotas = 0;
    private int empates = 0;

    public void ganhar() {
        vitorias++;
    }

    public void perder() {
        derrotas++;
    }

    public void empatar() {
        empates++;
    }

    public int mostrarPontuacao() {
        return vitorias * 3 + empates;
    }

    public String mostrarResultados() {
        return "Vitórias: " + vitorias + ", Empates: " + empates + ", Derrotas: " + derrotas;
    }

}

