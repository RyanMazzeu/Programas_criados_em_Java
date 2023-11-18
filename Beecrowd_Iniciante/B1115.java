import java.util.Scanner;

public class B1115 {
    public static void main(String[] args) {
        int x, y;
        Scanner scan = new Scanner(System.in);
        while (true) {
            x = scan.nextInt();
            y = scan.nextInt();

            if (x != 0 && y != 0) {
                if (x > 0 && y > 0) {
                    System.out.println("primeiro");
                }
                if (x > 0 && y < 0) {
                    System.out.println("quarto");
                }
                if (x < 0 && y > 0) {
                    System.out.println("segundo");
                }
                if (x < 0 && y < 0) {
                    System.out.println("terceiro");
                }

            } else {
                break;
            }
        }
        scan.close();
    }

}