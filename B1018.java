import java.util.Scanner;

public class B1018 {

    static int valores[] = { 100, 50, 20, 10, 5, 2, 1 };

    public static void main(String[] args) {
        int a;
        try (Scanner scan = new Scanner(System.in)) {
            a = scan.nextInt();
            System.out.println(a);
            for (int i = 0; i < 7; i++) {
                int j = 0;
                while (a >= valores[i]) {
                    j++;
                    a = a - valores[i];
                }
                System.out.printf("%d nota(s) de R$ %d,00\n", j, valores[i]);
            }
        }
    }
}