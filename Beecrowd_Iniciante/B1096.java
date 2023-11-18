public class B1096 {
    public static void main(String[] args) {
        int x = 0;
        for (int i = 1; i < 10; i = i + 2) {
            for (int j = 7 + x; j > 4 + x; j--)
                System.out.printf("I=%d J=%d\n", i, j);
            x = x + 2;
        }

    }

}