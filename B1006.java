import java.util.Locale;
import java.util.Scanner;

public class B1006 {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        try (Scanner scan = new Scanner(System.in)) {
            Double a = scan.nextDouble();
            Double b = scan.nextDouble();
            Double c = scan.nextDouble();

            Double media = (2* a + b * 3 + c*5) / 10;

            System.out.printf("MEDIA = %.1f%n",media);
        }

    }
}
