import java.util.Scanner;

public class Uri1174 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] vetA = new double[100];
        for (int i = 0; i < 100; i++) {
            vetA[i] = teclado.nextDouble();

        }
        for (int i = 0; i < 100; i++) {
            if (vetA[i] <= 10) {
                System.out.printf("A[%d] = %.1f\n", i, vetA[i]);

            }
        }
        teclado.close();
    }

}