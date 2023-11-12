import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class B1042 {
    public static void main(String[] args) {
        List<Integer> v = new ArrayList<>();
        List<Integer> v2;
        try (Scanner scan = new Scanner(System.in)) {
            v.add(scan.nextInt());
            v.add(scan.nextInt());
            v.add(scan.nextInt());
        }
        v2 = new ArrayList<>(v);
        Collections.sort(v2);

        System.out.printf("%d\n%d\n%d\n\n", v2.get(0), v2.get(1), v2.get(2));
        System.out.printf("%d\n%d\n%d\n", v.get(0), v.get(1), v.get(2));
    }
}