import java.util.Scanner;

public class B1114 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        while (true) {
            n = scan.nextInt();
            if (n == 2002) {
                break;
            } else {
                System.out.println("Senha Invalida");
            }
        }
        System.out.println("Acesso Permitido");
        scan.close();
    }

}