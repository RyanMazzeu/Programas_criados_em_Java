import java.util.Scanner;

public class A_Bitpp {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int x = 0;
            int n = 0;
            n = s.nextInt();
            s.nextLine();
            while (n > 0) {
                String comando;
                comando = s.nextLine();
                if (comando.contains("+")) {
                    x++;
                } else {
                    x--;
                }
                n--;
            }
            System.out.println(x);

        }
    }
}
