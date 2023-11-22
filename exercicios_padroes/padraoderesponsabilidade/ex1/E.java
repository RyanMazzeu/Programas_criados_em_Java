package exercicios_padroes.padraoderesponsabilidade.ex1;

public class E extends C {
    private double e1;

    public double getE1() {
        return e1;
    }

    @Override
    public void atualizar(double v) {
        this.e1 = v * 0.2;
    }

}