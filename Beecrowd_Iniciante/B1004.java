import java.util.Scanner;

public class B1004 {

    public static int product(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            int a = scan.nextInt();
            int b = scan.nextInt();

            System.out.println("PROD = " + product(a, b));
        }
    }
}
