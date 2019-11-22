import java.util.Scanner;

public class Uri1145 {

    public static void main(String[] args) {
        int X, Y, a, b = 0;
        Scanner teclado = new Scanner(System.in);

        X = teclado.nextInt();
        Y = teclado.nextInt();
        for (a = 1; a <= Y; a++) {
            b++;
            if (b == X) {
                System.out.printf("%d", a);
            } else {
                System.out.printf("%d ", a);
            }
            if (b == X) {
                {
                    b = 0;
                    System.out.printf("\n");
                }
            }
        }
        teclado.close();
    }
}