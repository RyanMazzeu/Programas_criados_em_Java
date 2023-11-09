import java.util.Locale;
import java.util.Scanner;

public class B1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String nome;
        double b, d;

        try (Scanner scan = new Scanner(System.in)) {
            nome = scan.next();
            b = scan.nextDouble();
            d = scan.nextDouble();

            System.out.printf("TOTAL = R$ %.2f\n", b + d * 15 / 100);
        }

    }
}
