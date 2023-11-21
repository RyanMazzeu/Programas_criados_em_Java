import java.util.ArrayList;
import java.util.List;

public class Missao extends Proposito {
    private List<Proposito> propositos = new ArrayList<Proposito>();

    @Override
    public int experiencia() {
        int soma = 0;
        for (Proposito p : propositos) {
            if (p.concluida)
                soma += 100 + p.experiencia();
            else
                soma += p.experiencia();
        }
        return soma;
    }

}