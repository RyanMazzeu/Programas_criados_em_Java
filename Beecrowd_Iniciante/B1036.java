import java.util.Scanner;
import java.util.Locale;

public class B1036 {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        double A, B, C, delta;
        try (Scanner scan = new Scanner(System.in)) {
            A = scan.nextDouble();
            B = scan.nextDouble();
            C = scan.nextDouble();

            delta = B * B - (4 * A * C);
            if (A != 0) {
                if (delta >= 0) {
                    System.out.printf("R1 = %.5f\n", (-B + Math.sqrt(delta)) / (2 * A));
                    System.out.printf("R2 = %.5f\n", (-B - Math.sqrt(delta)) / (2 * A));
                } else {
                    System.out.println("Impossivel calcular");
                }
            } else {
                System.out.println("Impossivel calcular");
            }
        }
    }

}