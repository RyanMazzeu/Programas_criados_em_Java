import java.util.Scanner;
import java.util.Locale;

public class B1012 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double A, B, C;
        try (Scanner scan = new Scanner(System.in)) {
            A = scan.nextDouble();
            B = scan.nextDouble();
            C = scan.nextDouble();

            System.out.printf("TRIANGULO: %.3f\n", (A * C) / 2);
            System.out.printf("CIRCULO: %.3f\n", 3.14159 * Math.pow(C, 2));
            System.out.printf("TRAPEZIO: %.3f\n", ((A + B) * C) / 2);
            System.out.printf("QUADRADO: %.3f\n", Math.pow(B, 2));
            System.out.printf("RETANGULO: %.3f\n", (A * B));
        }
    }

}