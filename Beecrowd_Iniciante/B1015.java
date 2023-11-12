import java.util.Scanner;
import java.util.Locale;

public class B1015 {
    public static void main(String args[]) {
        float x1, y1;
        float x2, y2;
        Locale.setDefault(Locale.US);
        try (Scanner scan = new Scanner(System.in)) {
            x1 = scan.nextFloat();
            y1 = scan.nextFloat();
            x2 = scan.nextFloat();
            y2 = scan.nextFloat();

            System.out.printf("%.4f\n", Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));

        }

    }
}