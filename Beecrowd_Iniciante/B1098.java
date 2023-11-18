import java.util.Locale;

public class B1098 {
    public static void main(String[] args) {
        float a = 0;
        Locale.setDefault(Locale.US);
        while (a <= 2.15f) {
            for (int i = 1; i < 4; i++) {
                if (((int) (a * 10) % 10) > 0)
                    System.out.printf("I=%.1f", a);
                else
                    System.out.printf("I=%d", (int) (a) % 10);

                if (((int) ((i + a) * 10) % 10) > 0)
                    System.out.printf(" J=%.1f\n", (float) i + a);
                else
                    System.out.printf(" J=%d\n", (int) (i + a) % 10);
            }
            a = a + 0.2f;
        }
    }
}