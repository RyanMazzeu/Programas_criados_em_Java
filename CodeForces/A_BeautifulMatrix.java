import java.util.Scanner;

public class A_BeautifulMatrix {
    public static void main(String[] args) {
        int m[][];
        int x = 0, y = 0;
        m = new int[5][5];
        try (Scanner s = new Scanner(System.in)) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    m[i][j] = s.nextInt();
                    if (m[i][j] == 1) {
                        x = i;
                        y = j;
                    }
                }
            }
            System.out.println(Math.abs(x - 2) + Math.abs(y - 2));
        }
    }
}