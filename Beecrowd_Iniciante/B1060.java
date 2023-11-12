import java.util.Scanner;
import java.util.Locale;

public class B1060 {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        float[] a;
        int s = 0;
        a = new float[6];
        try (Scanner scan = new Scanner(System.in)) {
            for (int i = 0; i < 6; i++) {
                a[0] = scan.nextFloat();
                if (a[0] > 0.00f) {
                    s++;
                }
            }
            System.out.printf("%d valores positivos\n", s);
        }
    }

}