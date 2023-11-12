import java.util.Scanner;
import java.util.Locale;

public class B1048 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            Locale.setDefault(Locale.US);
            float x, novo;
            int p;
            x = scan.nextFloat();

            if (x >= 0.00f && x <= 400.00f) {
                novo = x * 115f / 100f;
                p = 15;
            } else if (x > 400.00f && x <= 800.00f) {
                novo = x * 112f / 100f;
                p = 12;
            } else if (x > 800.00f && x <= 1200.00f) {
                novo = x * 110f / 100f;
                p = 10;
            } else if (x > 1200.00f && x <= 2000.00f) {
                novo = x * 107f / 100f;
                p = 7;
            } else {
                p = 4;
                novo = x * 104f / 100;
            }

            System.out.printf("Novo salario: %.2f\n", novo);
            System.out.printf("Reajuste ganho: %.2f\n", novo - x);
            System.out.printf("Em percentual: %d", p);
            System.out.println(" %");
        }
    }

}