import java.util.Scanner;

public class A_Watermelon {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            int x;
            x = s.nextInt();
            if (x > 2 && x <= 100 && x % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}