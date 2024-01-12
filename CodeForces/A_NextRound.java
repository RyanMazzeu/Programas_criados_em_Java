import java.util.Scanner;
public class A_NextRound {
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
            int qtd, chave,n=0;
            int participantes[];
            qtd = s.nextInt();
            chave = s.nextInt();
            participantes = new int[qtd];
            for(int i=0;i<qtd;i++){
                participantes[i] = s.nextInt();
            }
            for(int i=0;i<qtd;i++){
                if(participantes[i]>= participantes[chave-1] && participantes[i]>0){
                    n++;
                }
                else{
                    break;
                }
            }
            System.out.println(n);
        }
    }
}
