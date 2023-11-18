import java.util.Scanner;
import java.util.Locale;
public class B1116{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        while (n>0) {
            int x,y;
            x = scan.nextInt();
            y = scan.nextInt();
            if(y==0)
                System.out.println("divisao impossivel");
            else
                System.out.printf("%.1f\n",(float) x/y);
            n--;
        }
        scan.close();
    }
}