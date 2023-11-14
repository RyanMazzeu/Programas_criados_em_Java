import java.util.Scanner;

public class B1071 {
    public static void main(String[] args) {
        int x, y, s = 0;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        if (x > y) {
            for (int i = y + 1; i < x; i++) {
                if (i % 2 != 0) {
                    s += i;
                }
            }
        } else {
            for (int i = x + 1; i < y; i++) {
                if (i % 2 != 0) {
                    s += i;
                }
            }
        }
        System.out.println(s);
        sc.close();
    }

}