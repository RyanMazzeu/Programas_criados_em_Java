import java.util.Scanner;

public class B1080 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            int aux, aux2 = 0, maior = 0;
            for (int i = 0; i < 100; i++) {
                aux = scan.nextInt();
                if (aux > maior) {
                    maior = aux;
                    aux2 = i;
                }
            }
            System.out.println(maior);
            System.out.println(aux2+1);
        }
    }

}