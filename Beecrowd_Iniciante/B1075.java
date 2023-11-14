import java.util.Scanner;

public class B1075 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.close();
        for (int i = 1; i <= 10000; i++) {
            if (i % N == 2) {
                System.out.println(i);
            }
        }
    }

}