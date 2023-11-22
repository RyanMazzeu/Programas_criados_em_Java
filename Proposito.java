
public abstract class Proposito {

    private String descricao;
    public boolean concluida;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract int experiencia();
}