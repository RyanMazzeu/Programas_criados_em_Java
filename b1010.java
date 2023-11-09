import java.util.Locale;
import java.util.Scanner;

public class b1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String nome;
        float b, d;

        try (Scanner scan = new Scanner(System.in)) {
            nome = scan.next();
            b = scan.nextFloat();
            d = scan.nextFloat();

            System.out.printf("TOTAL = R$ %.2f\n", b + d * 15 / 100);
        }

    }
}