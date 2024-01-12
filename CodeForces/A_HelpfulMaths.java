import java.util.Scanner;
import java.util.Arrays;

public class A_HelpfulMaths {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String text;
            text = s.nextLine();
            text = text.replace("+", "");
            char[] aux;
            aux = text.toCharArray();
            Arrays.sort(aux);
            for (int i = 0; i < text.length(); i++) {
                if (i != text.length() - 1)
                    System.out.printf("%c+", aux[i]);
                else
                    System.out.println(aux[i]);
            }
        }
    }
}