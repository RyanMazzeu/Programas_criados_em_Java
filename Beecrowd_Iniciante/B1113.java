import java.util.Scanner;

public class B1113 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        Scanner scan = new Scanner(System.in);
        while (a != b) {
            a = scan.nextInt();
            b = scan.nextInt();
            if (a > b) {
                System.out.println("Decrescente");
            } else if (b > a) {
                System.out.println("Crescente");
            }
        }
        scan.close();
    }

}