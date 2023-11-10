import java.util.Scanner;
import java.util.Locale;

public class B1017 {
    public static void main(String args[]) {
        int a, b;
        Locale.setDefault(Locale.US);
        try (Scanner scan = new Scanner(System.in)) {
            a = scan.nextInt();
            b = scan.nextInt();
            System.out.printf("%.3f\n", (float) a * b / 12);
        }
    }

}