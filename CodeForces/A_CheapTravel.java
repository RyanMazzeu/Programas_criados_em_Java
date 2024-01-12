import java.util.Scanner;

public class A_CheapTravel {
    public static void main(String[] args) {
        double n, m, a, b, aux;
        try (Scanner scan = new Scanner(System.in)) {
            n = scan.nextDouble();
            m = scan.nextDouble();
            a = scan.nextDouble();
            b = scan.nextDouble();
            if (1 / a >= m / b) {
                System.out.printf("%.0f", n * a);
            } else {
                aux = Math.floor(n / m);
                if (b <= a || m > n && a * n > b) {
                    System.out.printf("%.0f", Math.ceil(n / m) * b);
                } else {
                    System.out.printf("%.0f", aux * b + (n - aux * m) * a);
                }
            }
        }
    }
}
