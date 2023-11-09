import java.util.Scanner;
import java.util.Locale;

public class B1014 {
    public static void main(String args[]) {
        int distancia;
        float valor;
        Locale.setDefault(Locale.US);
        try (Scanner scan = new Scanner(System.in)) {
            distancia = scan.nextInt();
            valor = scan.nextFloat();

            System.out.printf("%.3f km/l", distancia / valor);

        }

    }
}