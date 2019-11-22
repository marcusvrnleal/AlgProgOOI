import java.util.Scanner;

public class Uri1064 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double valor = 0, media = 0;
        int numPositivos = 0;
        for (int i = 0; i < 6; i++) {
            valor = teclado.nextDouble();
            if (valor > 0) {
                numPositivos++;
                media = (media + valor);

            }

        }
        media = media / numPositivos;
        System.out.printf(numPositivos + " valores positivos\n");
        System.out.printf("%.1f\n",media);
    }
}