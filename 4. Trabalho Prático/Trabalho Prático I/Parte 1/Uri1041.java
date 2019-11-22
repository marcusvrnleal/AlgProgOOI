import java.util.Scanner;

public class Uri1041{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double x = teclado.nextDouble();
        double y = teclado.nextDouble();

        if ((x == 0) && (y == 0)) {
            System.out.print("Origem\n");
        } else if (x == 0) {
            System.out.print("Eixo Y\n");
        } else if (y == 0) {
            System.out.print("Eixo X\n");
        } else if ((x > 0) && (y > 0)) {
            System.out.print("Q1\n");
        } else if ((x < 0) && (y > 0)) {
            System.out.print("Q2\n");
        } else if ((x < 0) && (y < 0)) {
            System.out.print("Q3\n");
        } else if ((x > 0) && (y < 0)) {
            System.out.print("Q4\n");
        }
        teclado.close();
    }
}