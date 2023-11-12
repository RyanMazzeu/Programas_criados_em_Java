import java.util.Scanner;

public class B1021 {

    static float valores[] = { 100, 50, 20, 10, 5, 2 };
    static float moedas[] = { 1.00f, 0.5f, 0.25f, 0.10f, 0.05f, 0.01f };

    public static void main(String[] args) {
        float a;
        try (Scanner scan = new Scanner(System.in)) {
            a = Float.parseFloat(scan.nextLine());

            System.out.println("NOTAS:");
            for (int i = 0; i < 6; i++) {
                int j = 0;
                while (a >= valores[i]) {
                    j++;
                    a = a - valores[i];
                }
                System.out.printf("%d nota(s) de R$ %.2f\n", j, valores[i]);
            }
            System.out.println("MOEDAS:");
            a = a + 0.009f;
            for (int i = 0; i < 6; i++) {
                int j = 0;


                while (a >= moedas[i]) {
                    j++;
                    a = a - moedas[i];
                }
                System.out.printf("%d moeda(s) de R$ %.2f\n", j, moedas[i]);
            }
        }
    }
}