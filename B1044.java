import java.util.Scanner;

public class B1044 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int A, B;
            A = scan.nextInt();
            B = scan.nextInt();

            if (A % B == 0 || B % A == 0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        }
    }

}