import java.util.Scanner;
import java.util.Locale;

public class B1079 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner scan = new Scanner(System.in)) {

            int n;
            n = scan.nextInt();

            for (; n > 0; n--) {
                float a, b, c;
                a = scan.nextFloat();
                b = scan.nextFloat();
                c = scan.nextFloat();

                System.out.printf("%.1f\n", (a * 2 + b * 3 + c * 5) / 10);
            }
        }
    }
}
