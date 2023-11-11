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
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", (fim - inicio) % 60,
                        (fim - inicio) - ((fim - inicio) % 60) * 60);
            } else {
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", (24 - (hinicio - hfim)) % 60,
                        (24 - (hinicio - hfim)) - ((24 - (hinicio - hfim)) % 60) * 60);
            }
        }
    }
}