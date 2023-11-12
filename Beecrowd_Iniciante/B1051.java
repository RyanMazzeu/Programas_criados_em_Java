import java.util.Scanner;

public class B1051 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            float a, b;
            float imposto = 0;
            a = scan.nextFloat();
            if (a > 4500.00f) {
                b = a - 4500;
                imposto = imposto + b * 28 / 100;
                a = 4500.00f;
            }
            if (a > 3000.00f) {
                b = a - 3000;
                imposto = imposto + b * 18 / 100;
                a = 3000.00f;
            }
            if (a > 2000.00f) {
                b = a - 2000;
                imposto = imposto + b * 8 / 100;
            }
            if (a > 0.00f && imposto > 0.00f) {
                System.out.printf("R$ %.2f\n", imposto);
            } else {
                System.out.println("Isento");
            }
        }
    }
}