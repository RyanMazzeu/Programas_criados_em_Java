import java.util.Scanner;

public class B1099 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n;
            n = scan.nextInt();
            for (; n > 0; n--) {
                int a, b;
                a = scan.nextInt();
                b = scan.nextInt();
                int maior, menor, soma = 0;

                if (a > b) {
                    maior = a;
                    menor = b;
                } else {
                    maior = b;
                    menor = a;
                }

                for (int i = menor + 1; i < maior; i++) {
                    if (i % 2 != 0) {
                        soma = soma + i;
                    }
                }
                System.out.println(soma);
            }
        }
    }

}