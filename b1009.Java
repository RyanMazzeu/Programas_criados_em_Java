import java.util.Locale;
import java.util.Scanner;

public class b1009{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
        String nome;
        float a, b;

        nome = scanner.nextString();
        a = scanner.nextFloat();
        b = scanner.nextFloat();

        System.out.printf("TOTAL = ", a * b*15/100);
    }
}