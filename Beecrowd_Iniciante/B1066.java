import java.util.Scanner;

public class B1066 {
    public static void main(String args[]) {
        int[] a;
        int pares = 0, impares = 0, positivos = 0, negativos = 0;
        Scanner scan = new Scanner(System.in);
        a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (a[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            if (a[i] > 0) {
                positivos++;
            } else if (a[i] < 0) {
                negativos++;
            }
        }
        System.out.printf("%d valor(es) par(es)\n", pares);
        System.out.printf("%d valor(es) impar(es)\n", impares);
        System.out.printf("%d valor(es) positivo(s)\n", positivos);
        System.out.printf("%d valor(es) negativo(s)\n", negativos);
        scan.close();
    }
}