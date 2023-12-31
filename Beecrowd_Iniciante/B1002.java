import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class B1002 {
    public static final BigDecimal pi = new BigDecimal("3.14159");

    public static BigDecimal raio(BigDecimal r) {
        return pi.multiply(r).multiply(r);
    }

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        try (Scanner scan = new Scanner(System.in)) {
            BigDecimal a = scan.nextBigDecimal();

            System.out.printf("A=%.4f%n", raio(a));
        }
    }
}

