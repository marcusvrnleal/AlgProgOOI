import java.util.Scanner;

public class Uri1158{

    public static void main(String[] args) {

        int numTeste, numX, numY, j, total;
        Scanner teclado = new Scanner(System.in);
        numTeste = teclado.nextInt();

        for (int i = 1; i <= numTeste; i++) {
            int sum = 0;
            numX = teclado.nextInt();
            numY = teclado.nextInt();
            for (j = numX, total = 0; total < numY; j++) {
                if (j % 2 != 0) {
                    sum += j;
                    total += 1;
                }
            }
            System.out.print(sum + "\n");
        }

    }
}