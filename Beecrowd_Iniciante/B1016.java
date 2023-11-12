import java.util.Scanner;
import java.util.Locale;

public class B1016 {
    public static void main(String args[]) {

        Locale.setDefault(Locale.US);

        try (Scanner scan = new Scanner(System.in)) {
            int km;
            km = scan.nextInt();
            System.out.println(km * 2 + " minutos");
        }
    }

}