import java.util.Scanner;

public class B1041 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            float x, y;
            x = scan.nextFloat();
            y = scan.nextFloat();

            if (x == 0 && y == 0) {
                System.out.println("Origem");
            } else if (x == 0) {
                System.out.println("Eixo Y");
            } else if (y == 0) {
                System.out.println("Eixo X");
            } else if (x > 0 && y > 0) {
                System.out.println("Q1");
            } else if (x < 0 && y > 0) {
                System.out.println("Q2");
            } else if (x < 0 && y < 0) {
                System.out.println("Q3");
            } else if (x > 0 && y < 0) {
                System.out.println("Q4");
            }
        }
    }

}