import java.util.Scanner;
public class A_PetyaandStrings {
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
            String a,b;
            a = s.nextLine();
            b = s.nextLine();
            a = a.toLowerCase();
            b = b.toLowerCase();
            int x=0;
            
            

            for(int i=0;i<a.length();i++){
                if(((int) a.charAt(i))>(int) b.charAt(i)){
                    x = 1;
                    break;
                }else if(((int) a.charAt(i))<(int) b.charAt(i)){
                    x=-1;
                    break;
                }
            }
            System.out.println(x);

        }
    }
}
