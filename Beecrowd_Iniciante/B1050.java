import java.util.Scanner;

public class B1050 {
    public static int[] DDD = { 61, 71, 11, 21, 32, 19, 27, 31 };
    public static String[] Estados = { "Brasilia", "Salvador", "Sao Paulo", "Rio de Janeiro", "Juiz de Fora",
            "Campinas",
            "Vitoria",
            "Belo Horizonte" };

    public static void main(String args[]) {
        try (Scanner scan = new Scanner(System.in)) {
            int d;
            d = scan.nextInt();

            for (int i = 0; i < 8; i++) {
                if (d == DDD[i]) {
                    System.out.println(Estados[i]);
                    break;
                }
                if (i == 7) {
                    System.out.println("DDD nao cadastrado");
                }
            }
        }
    }

}