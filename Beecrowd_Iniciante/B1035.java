import java.util.Scanner;

public class B1035 {
    public static void main(String args[]) {
        int A, B, C, D;
        try(Scanner scan = new Scanner(System.in)){
            A = scan.nextInt();
            B = scan.nextInt();
            C = scan.nextInt();
            D = scan.nextInt();

            if (B > C && D > A && C + D > A + B && C > 0 && D > 0 && A % 2 == 0) {
                System.out.println("Valores aceitos");
            } else {
                System.out.println("Valores nao aceitos");
            }
    }  
    }

}