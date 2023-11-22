package questao1listap2;

import java.util.ArrayList;
import java.util.List;

public class Missao extends Proposito {
    private List<Proposito> propositos = new ArrayList<Proposito>();

    public void addProposito(Proposito p) {
        propositos.add(p);
    }

    public List<Proposito> getPropositos() {
        return propositos;
    }

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