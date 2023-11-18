import java.util.Scanner;

public class B1101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m, n = 1;

        while (true) {
            int sum = 0;
            m = scan.nextInt();
            n = scan.nextInt();
            if (n > 0 && m > 0) {
                if (m > n) {
                    for (; n <= m; n++) {
                        System.out.printf("%d ", n);
                        sum = sum + n;
                    }
                } else {
                    for (; m <= n; m++) {
                        System.out.printf("%d ", m);
                        sum = sum + m;
                    }
                }
                System.out.printf("Sum=%d\n", sum);
            } else {
                break;
            }
        }

        scan.close();
    }
}