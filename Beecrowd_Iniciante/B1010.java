import java.util.Locale;
import java.util.Scanner;

public class B1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        // int cod1, cod2;
        int qtd1, qtd2;
        float preco1, preco2;

        try (Scanner scan = new Scanner(System.in)) {
            // cod1 = scan.nextInt();s
            qtd1 = scan.nextInt();
            preco1 = scan.nextFloat();

            // cod2 = scan.nextInt();
            qtd2 = scan.nextInt();
            preco2 = scan.nextFloat();
        }

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", qtd1 * preco1 + qtd2 * preco2);
    }
}
