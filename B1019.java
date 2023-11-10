import java.util.Scanner;

public class B1019 {

    public static void main(String[] args) {
        int seg;
        int h = 0;
        int m = 0;
        try (Scanner scan = new Scanner(System.in)) {
            seg = scan.nextInt();

            while (seg >= 3600) {
                seg = seg - 3600;
                h++;
            }
            while (seg >= 60) {
                seg = seg - 60;
                m++;
            }
            System.out.printf("%d:%d:%d\n", h, m, seg);
        }
    }
}