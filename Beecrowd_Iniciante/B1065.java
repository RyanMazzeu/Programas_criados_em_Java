import java.util.Scanner;
import java.util.Locale;

public class B1065 {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        int[] a;
        int s = 0;
        a = new int[5];
        try (Scanner scan = new Scanner(System.in)) {
            for (int i = 0; i < 5; i++) {
                a[i] = scan.nextInt();
                if (a[i] % 2 == 0) {
                    s++;
                }
            }
            System.out.printf("%d valores pares\n", s);
        }
    }

}