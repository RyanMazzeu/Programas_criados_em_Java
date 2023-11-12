import java.util.Locale;
import java.util.Scanner;

public class B1005 {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        try (Scanner scan = new Scanner(System.in)) {
            Double a = scan.nextDouble();
            Double b = scan.nextDouble();
            Double media = (3.5f* a + b * 7.5f) / 11;
            System.out.printf("MEDIA = %.5f%n",media);
        }

    }
}
