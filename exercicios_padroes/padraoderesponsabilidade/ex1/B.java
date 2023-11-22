package exercicios_padroes.padraoderesponsabilidade.ex1;
import java.util.ArrayList;
import java.util.List;

public class B{
    private List<C> lista = new ArrayList<C>();

    protected void notificar(double v){
        for(int i=0;i<lista.size();i++){
            lista.get(i).atualizar(v);
        }
    }
}