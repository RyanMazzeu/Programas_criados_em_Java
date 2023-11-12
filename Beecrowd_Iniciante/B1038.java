import java.util.Scanner;
import java.util.Locale;

public class B1038 {
    public static void main(String args[]) {
        int cod, qtd;
        Locale.setDefault(Locale.US);
        float codigos[] = { 4.00f, 4.50f, 5.00f, 2.00f, 1.50f };
        try (Scanner scan = new Scanner(System.in)) {
            cod = scan.nextInt();
            qtd = scan.nextInt();
            System.out.printf("Total: R$ %.2f\n", (float) codigos[cod - 1] * qtd);

        }
    }
}
