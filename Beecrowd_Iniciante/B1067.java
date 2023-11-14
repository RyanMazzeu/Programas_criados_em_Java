import java.util.Scanner;
public class B1067 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        for (int i = 1; i <= x; i += 2) {
            System.out.println(i);
        }
        scan.close();
    }
}