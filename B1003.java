import java.util.Scanner;

public class B1003 {
    public static int soma(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            int a = scan.nextInt();
            int b = scan.nextInt();

            System.out.println("SOMA = " + soma(a, b));
        }

    }
}
