import java.util.Scanner;

public class B1020 {

    public static void main(String[] args) {
        int ano = 0;
        int mes = 0;
        int dia = 0;
        try (Scanner scan = new Scanner(System.in)) {
            dia = scan.nextInt();

            while (dia >= 365) {
                dia = dia - 365;
                ano++;
            }
            while (dia >= 30) {
                dia = dia - 30;
                mes++;
            }
            System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", ano, mes, dia);
        }
    }
}