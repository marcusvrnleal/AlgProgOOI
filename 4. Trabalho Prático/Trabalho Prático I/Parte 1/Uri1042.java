import java.util.Scanner;

public class Uri1042 {

    public static void main(String[] args) {

        int min1, min2 = 0, min3 = 0;
        Scanner teclado = new Scanner(System.in);

        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();

        min1 = Math.min(num1, Math.min(num2, num3));

        if (min1 == num1) {
            min2 = Math.min(num2, num3);
            min3 = Math.max(num2, num3);
        }
        if (min1 == num2) {
            min2 = Math.min(num1, num3);
            min3 = Math.max(num1, num3);
        }
        if (min1 == num3) {
            min2 = Math.min(num1, num2);
            min3 = Math.max(num1, num2);
        }
        System.out.println();
        System.out.print(min1 + "\n" + min2 + "\n" + min3 + "\n\n");
        System.out.print(num1 + "\n" + num2 + "\n" + num3 + "\n");

        teclado.close();

    }

}