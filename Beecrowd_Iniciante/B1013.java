import java.util.Scanner;
import java.util.Locale;

public class B1013 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner scan = new Scanner(System.in)) {
            int a, b, c;
            a = scan.nextInt();
            b = scan.nextInt();
            c = scan.nextInt();

            if (a >= b && a >= c) {
                System.out.println(a + " eh o maior");
            }
            if (b > a && b >= c) {
                System.out.println(b + " eh o maior");
            }
            if (c > a && c > b) {
                System.out.println(c + " eh o maior");
            }
        }
    }

}