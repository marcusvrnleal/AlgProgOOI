import java.util.Scanner;

public class Uri1101 {

    public static void main(String[] args) {
        int X, Y;
        Scanner teclado = new Scanner(System.in);

        while (((X = teclado.nextInt()) > 0) && ((Y = teclado.nextInt()) > 0)) {
            int sum = 0;
            if (X > Y) {
                for (Y = Y; Y <= X; Y++) {
                    sum += Y;
                    System.out.print(Y + " ");
                }
                System.out.print("Sum=" + sum + "\n");
            } else {
                for (X = X; X <= Y; X++) {
                    sum += X;
                    System.out.print(X + " ");
                }
                System.out.print("Sum=" + sum + "\n");
            }
        }

    }

}