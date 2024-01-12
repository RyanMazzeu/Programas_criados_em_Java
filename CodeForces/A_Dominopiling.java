import java.util.Scanner;

public class A_Dominopiling {
    public static void main(String[] args) {
        double n, m;
        try (Scanner s = new Scanner(System.in)) {
            n = s.nextDouble();
            m = s.nextDouble();

            System.out.printf("%.0f",Math.floor(n*m/2));
        }
    }
}
