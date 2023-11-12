import java.util.Scanner;
import java.lang.Math;

public class B1043 {
    public static void main(String[] args) {
        float A, B, C;
        try (Scanner scan = new Scanner(System.in)) {
            A = scan.nextFloat();
            B = scan.nextFloat();
            C = scan.nextFloat();
            if ((Math.abs(B - C) < A && A < B + C)
                    && (Math.abs(A - C) < B && B < A + C)
                    && (Math.abs(A - B) < C && C < A + B)) {
                System.out.printf("Perimetro = %.1f\n", A + B + C);
            } else {
                System.out.printf("Area = %.1f\n", (A + B) * C / 2);
            }

        }

    }

}