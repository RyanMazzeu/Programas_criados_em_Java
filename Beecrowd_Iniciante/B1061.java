import java.util.Scanner;

public class B1061 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String aux;
        int dia1, hora1, minuto1, segundo1;
        int dia2, hora2, minuto2, segundo2;

        String frase = scan.nextLine();
        dia1 = Integer.parseInt(frase.replaceAll("\\D", ""));
        frase = scan.nextLine();
        aux = frase.replaceAll("\\D", "");
        hora1 = Integer.parseInt(aux.substring(0, 2));
        minuto1 = Integer.parseInt(aux.substring(2, 4));
        segundo1 = Integer.parseInt(aux.substring(4, 6));

        frase = scan.nextLine();
        dia2 = Integer.parseInt(frase.replaceAll("\\D", ""));
        frase = scan.nextLine();
        aux = frase.replaceAll("\\D", "");
        hora2 = Integer.parseInt(aux.substring(0, 2));
        minuto2 = Integer.parseInt(aux.substring(2, 4));
        segundo2 = Integer.parseInt(aux.substring(4, 6));

        int dia = dia2 - dia1;
        int hora = hora2 - hora1;
        int minuto = minuto2 - minuto1;
        int segundo = segundo2 - segundo1;

        if (segundo < 0) {
            segundo += 60;
            minuto--;
        }
        if (minuto < 0) {
            minuto += 60;
            hora--;
        }
        if (hora < 0) {
            hora += 24;
            dia--;
        }

        System.out.println(dia + " dia(s)");
        System.out.println(hora + " hora(s)");
        System.out.println(minuto + " minuto(s)");
        System.out.println(segundo + " segundo(s)");

        scan.close();
    }

}