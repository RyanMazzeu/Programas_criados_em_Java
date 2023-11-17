import java.util.Scanner;
import java.util.Locale;

public class B1094 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner scan = new Scanner(System.in)) {
            int sapos = 0, ratos = 0, coelhos = 0;
            int n, quantia;
            char c;
            n = scan.nextInt();
            for (; n > 0; n--) {
                quantia = scan.nextInt();
                c = scan.next().charAt(0);
                switch (c) {
                    case 'C':
                        coelhos = coelhos + quantia;
                        break;
                    case 'S':
                        sapos = sapos + quantia;
                        break;
                    case 'R':
                        ratos = ratos + quantia;
                        break;
                }
            }
            int total = sapos + coelhos + ratos;
            System.out.printf("Total: %d cobaias\n", total);
            System.out.printf("Total de coelhos: %d\n", coelhos);
            System.out.printf("Total de ratos: %d\n", ratos);
            System.out.printf("Total de sapos: %d\n", sapos);

            System.out.printf("Percentual de coelhos: %.2f ", (float) coelhos * 100f / (float) total);
            System.out.println("%");
            System.out.printf("Percentual de ratos: %.2f ", (float) ratos * 100f / (float) total);
            System.out.println("%");
            System.out.printf("Percentual de sapos: %.2f ", (float) sapos * 100f / (float) total);
            System.out.println("%");

        }
    }

}