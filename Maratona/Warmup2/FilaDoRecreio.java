import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class FilaDoRecreio {
	public static void main(String args[]) {
		try (Scanner s = new Scanner(System.in)) {
			Integer n, m, x[], y[];
			n = s.nextInt();
			while (n > 0) {
				int q = 0;
				m = s.nextInt();
				x = new Integer[m];
				y = new Integer[m];
				for (int i = 0; i < m; i++) {
					x[i] = s.nextInt();
					y[i] = x[i];
				}

				Arrays.sort(x, new Comparator<Integer>(){  //Ordenando em Ordem decrescente
					@Override
					public int compare(Integer a, Integer b){
						if(a>b){
							return -1;
						}else{
							return 1;
						}
					}
				});


				for (int i = 0; i < m; i++) {
					if(x[i]!=y[i]){
						q++;
					}
				}
				n--;
				System.out.println(m-q);
			}
		}
	}

}
