import java.util.Scanner;

public class B1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x;
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            if (x == 0) {
                System.out.println("NULL");
            } else if (x % 2 == 0) {
                if (x > 0) {
                    System.out.println("EVEN POSITIVE");
                } else {
                    System.out.println("EVEN NEGATIVE");
                }
            } else {
                if (x > 0) {
                    System.out.println("ODD POSITIVE");
                } else {
                    System.out.println("ODD NEGATIVE");
                }
            }
        }
        sc.close();
    }
}