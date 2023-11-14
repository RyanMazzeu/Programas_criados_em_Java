import java.util.Scanner;

public class B1070 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (x % 2 == 0) {
            x++;
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(x);
            x += 2;
        }
        scan.close();
    }
}