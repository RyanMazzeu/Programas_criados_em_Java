import java.util.Scanner;
import java.util.Locale;

public class B1117 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            Locale.setDefault(Locale.US);
            float n1 = -1, n2 = -1, aux;
            while (n1 == -1 || n2 == -1) {
                aux = scan.nextFloat();
                if (aux >= 0.0f && aux <= 10.0f) {
                    if (n1 == -1)
                        n1 = aux;
                    else {
                        n2 = aux;
                        System.out.printf("media = %.2f", (n1 + n2) / 2);
                    }
                } else {
                    System.out.println("nota invalida");
                }
            }
        }
    }
}
