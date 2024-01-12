import java.util.Scanner;

public class A_TheatreSquare {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            double a, b, c, x, y;
            a = scan.nextInt();
            b = scan.nextInt();
            c = scan.nextInt();

            x = Math.ceil(a / c);
            y = Math.ceil(b / c);

            System.out.printf("%.0f\n", x * y);

        }
    }
}