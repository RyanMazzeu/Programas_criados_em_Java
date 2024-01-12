import java.util.Scanner;

public class A_WordCapitalization{
	public static void main(String args[]){
		try(Scanner s = new Scanner(System.in)){
			String x;
			x = s.nextLine();
            char[] c = x.toCharArray();
			if(c[0]<91){
				System.out.println(c);
			}else{
				c[0] =(char) ((int) c[0] - 32);
				System.out.println(c); 	
			}	
		}		
	}
}