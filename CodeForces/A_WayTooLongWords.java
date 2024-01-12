import java.util.Scanner;

public class A_WayTooLongWords {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int x;
            x = s.nextInt();
            s.nextLine();
            String palavra;
            while (x > 0) {
                x--;
                palavra = s.nextLine();
                if (palavra.length() > 10) {
                    System.out.printf("%c%d%c\n", palavra.charAt(0), palavra.length() - 2,
                            palavra.charAt(palavra.length() - 1));
                } else {
                    System.out.println(palavra);
                }
            }
        }
    }
}
