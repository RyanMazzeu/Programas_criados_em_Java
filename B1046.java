import java.util.Scanner;

public class B1046 {
    public static void main(String[] args) {
        int inicio, fim;
        try (Scanner scan = new Scanner(System.in)) {
            inicio = scan.nextInt();
            fim = scan.nextInt();

            if (fim > inicio) {
                System.out.printf("O JOGO DUROU %d HORA(S)\n", fim - inicio);
            } else {
                System.out.printf("O JOGO DUROU %d HORA(S)\n", 24 - (inicio - fim));
            }
        }
    }
}