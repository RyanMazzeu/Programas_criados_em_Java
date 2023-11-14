import java.util.Scanner;

public class B1072 {
    public static void main(String args[]) {
        int n = 0, in = 0, out = 0;
        int x = 0;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            x = scan.nextInt();
            if (x >= 0 && x <= 20) {
                in++;
            } else {
                out++;
            }
        }
        System.out.printf("%d in\n", in);
        System.out.printf("%d out\n", out);
        scan.close();
    }

}