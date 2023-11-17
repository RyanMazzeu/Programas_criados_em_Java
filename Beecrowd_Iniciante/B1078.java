import java.util.Scanner;

public class B1078 {
    public static void main(String args[]) {
        int a;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();

        for(int i=1;i<11;i++){
            System.out.printf("%d x %d = %d\n",i,a,i*a);
        }
        scan.close();

    }
}