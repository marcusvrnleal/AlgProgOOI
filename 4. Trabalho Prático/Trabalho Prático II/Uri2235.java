import java.util.Scanner;

public class Uri2235 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();

        if (a == b || a == c || b == a || b == c)
            System.out.println("S");
        else if (a + b == c || a + c == b || b + c == a)
            System.out.println("S");
        else
            System.out.println("N");

        teclado.close();
    }
}