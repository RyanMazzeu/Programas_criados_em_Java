package exercicios_padroes.padraoderesponsabilidade.ex1;


public class D extends C {
    private double d1;

    public double getD1() {
        return d1;
    }

    @Override
    public void atualizar(double v) {
        this.d1 = v * 0.1;
    }

}