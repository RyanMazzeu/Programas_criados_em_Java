import java.util.Scanner;

public class A_Team {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n, q = 0;
            n = scanner.nextInt();
            while (n > 0) {
                int a, b, c;
                a = scanner.nextInt();
                b = scanner.nextInt();
                c = scanner.nextInt();
                if (a != 0 && b != 0 || a != 0 && c != 0 || b != 0 && c != 0) {
                    q++;
                }
                n--;
            }
            System.out.println(q);
        }
    }
}
