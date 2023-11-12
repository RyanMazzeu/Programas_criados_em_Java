import java.util.Scanner;
import java.util.Locale;

public class B1037 {
    public static void main(String args[]) {
        float a;
        Locale.setDefault(Locale.US);
        try (Scanner scan = new Scanner(System.in)) {
            a = scan.nextFloat();
            if (a >= 0.0000f && a <= 25.00000f) {
                System.out.printf("Intervalo [0,25]\n");
            } else if (a >= 25.00001f && a <= 50.00000f) {
                System.out.printf("Intervalo (25,50]\n");
            } else if (a >= 50.00001f && a <= 75.00000f) {
                System.out.printf("Intervalo (50,75]\n");
            } else if (a >= 75.00001f && a <= 100.00000f) {
                System.out.printf("Intervalo (75,100]\n");
            } else {
                System.out.printf("Fora de intervalo\n");
            }
        }
    }

}