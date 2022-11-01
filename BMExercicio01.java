public class BMExercicio01 {

    private String estadoDaLampada = "Desligada";

    public void acende() {
        estadoDaLampada = "Ligada";
    }

    public void apaga() {
        estadoDaLampada = "Desligada";
    }

    public String mostraEstado() {
        return estadoDaLampada;
    }

}
