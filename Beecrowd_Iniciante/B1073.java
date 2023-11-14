import java.util.Scanner;

public class B1073 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        for (int i = 2; i <= x; i += 2)
            System.out.printf("%d^2 = %d\n", i, i * i);

        sc.close();
    }

}