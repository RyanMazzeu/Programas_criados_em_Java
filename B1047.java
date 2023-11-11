import java.util.Scanner;

public class B1047 {
    public static void main(String[] args) {
        int hinicio, hfim, minicio, mfim, inicio, fim;
        try (Scanner scan = new Scanner(System.in)) {
            hinicio = scan.nextInt();
            minicio = scan.nextInt();
            hfim = scan.nextInt();
            mfim = scan.nextInt();

            inicio = hinicio * 60 + minicio;
            fim = hfim * 60 + mfim;

            if (fim > inicio) {
                if (fim - inicio >= 60)
                    System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", (fim - inicio) / 60,
                            (fim - inicio) % 60);
                else
                    System.out.printf("O JOGO DUROU 0 HORA(S) E %d MINUTO(S)\n", (fim - inicio));
            } else {
                int duracao = 24 * 60 - inicio + fim; // Calculate the duration in minutes
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duracao / 60, duracao % 60);
            }
        }
    }
}
