import java.util.Scanner;
import java.util.Locale;

public class B1064 {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        double[] a;
        int s = 0;
        double soma = 0.00;
        a = new double[6];
        try (Scanner scan = new Scanner(System.in)) {
            for (int i = 0; i < 6; i++) {
                a[i] = scan.nextDouble();
                if (a[i] > 0.00) {
                    s++;
                    soma = soma + a[i];
                }
            }
            System.out.printf("%d valores positivos\n", s);
            System.out.printf("%.1f\n", soma / s); // Use %.1f for displaying 1 decimal place
        }
    }
}