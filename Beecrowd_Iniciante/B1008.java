import java.util.Locale;
import java.util.Scanner;

public class B1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner scanner = new Scanner(System.in)) {
            int a, b;
            float c;
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextFloat();

            System.out.println("NUMBER = " + a);
            System.out.printf("SALARY = U$ %.2f%n", b * c);
        }
    }
}
