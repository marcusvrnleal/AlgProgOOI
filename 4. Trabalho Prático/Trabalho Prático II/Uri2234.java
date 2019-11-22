import java.util.Scanner;

public class Uri2234 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        System.out.printf("%.2f\n", A / B);
        teclado.close();
    }
}