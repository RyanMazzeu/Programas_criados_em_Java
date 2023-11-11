import java.util.Scanner;
import java.util.Locale;

class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        float N1, N2, N3, N4, exame, media, mediaf;
        try (Scanner scan = new Scanner(System.in)) {
            N1 = scan.nextFloat();
            N2 = scan.nextFloat();
            N3 = scan.nextFloat();
            N4 = scan.nextFloat();
            media = (2 * N1 + 3 * N2 + 4 * N3 + N4) / 10;

            System.out.printf("Media: %.1f\n", media);
            if (media > 7.0) {
                System.out.println("Aluno aprovado.");
            } else if (media >= 5.0) {
                System.out.println("Aluno em exame.");
                exame = scan.nextFloat();
                System.out.printf("Nota do exame: %.1f\n", exame);
                mediaf = (media + exame) / 2;
                if (mediaf >= 5.0) {
                    System.out.println("Aluno aprovado.");
                } else {
                    System.out.println("Aluno reprovado.");
                }
                System.out.printf("Media final: %.1f\n", mediaf);
            } else {
                System.out.println("Aluno reprovado.");
            }
        }
    }

}