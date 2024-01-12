// Classe base Comida
class Comida {
    String nome;
    int calorias;

    public Comida(String nome, int calorias) {
        this.nome = nome;
        this.calorias = calorias;
    }

    public int calcularCalorias() {
        return calorias;
    }
}

// Subclasse Fruta
class Fruta extends Comida {
    String tipo;

    public Fruta(String nome, int calorias, String tipo) {
        super(nome, calorias);
        this.tipo = tipo;
    }

    @Override
    public int calcularCalorias() {
        // Exemplo de variação de calorias para frutas
        if ("citrino".equals(tipo)) {
            return (int) (super.calcularCalorias() * 1.2);
        } else {
            return super.calcularCalorias();
        }
    }
}

// Classe Humano
class Humano {
    String nome;
    int caloriasConsumidas;

    public Humano(String nome) {
        this.nome = nome;
        this.caloriasConsumidas = 0;
    }

    public void comer(Comida comida) {
        int caloriasGanhas = comida.calcularCalorias();
        caloriasConsumidas += caloriasGanhas;
        System.out.println(nome + " comeu " + comida.nome + " e ganhou " + caloriasGanhas + " calorias.");
    }
}

// Exemplo de uso
public class Teste {
    public static void main(String[] args) {
        Fruta maca = new Fruta("Maçã", 50, "citrino");
        Fruta banana = new Fruta("Banana", 80, "não citrino");
        Humano pessoa = new Humano("João");

        pessoa.comer(maca);
        pessoa.comer(banana);

        System.out.println("Total de calorias consumidas por " + pessoa.nome + ": " + pessoa.caloriasConsumidas);
    }
}
