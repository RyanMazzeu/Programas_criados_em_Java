import java.util.Scanner;

public class B1052 {
    public static String[] meses = { "January", "February", "March", "April", "May", "June", "July", "August",
            "September", "October", "November", "December" };

    public static void main(String args[]) {
        try (Scanner scan = new Scanner(System.in)) {
            short a;
            a = scan.nextShort();
            System.out.println(meses[a - 1]);
        }
    }

}