import java.util.Locale;
import java.util.Scanner;

public class B1011 {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        float raio;

        try (Scanner scan = new Scanner(System.in)) {
            raio = scan.nextFloat();
            System.out.printf("VOLUME = %.3f", (4.0 / 3) * 3.14159 * Math.pow(raio, 3));
        }

    }
}