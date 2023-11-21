public class Objetivo extends Proposito {
    private int recompensa;

    public int getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }

    @Override
    public int experiencia() {
        return recompensa;
    }
}