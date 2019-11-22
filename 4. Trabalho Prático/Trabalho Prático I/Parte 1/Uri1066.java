import java.util.Scanner;

public class Uri1066 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valores, contPar = 0, contImpar = 0, contPos = 0, contNeg = 0;
        for (int i = 0; i < 5; i++) {
            valores = teclado.nextInt();
            if (valores % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
            if (valores > 0) {
                contPos++;
            }
            if (valores < 0) {
                contNeg++;
            }
        }
        System.out.println(contPar + " valor(es) par(es)");
        System.out.println(contImpar + " valor(es) impar(es)");
        System.out.println(contPos + " valor(es) positivo(s)");
        System.out.println(contNeg + " valor(es) negativo(s)");
    }
}
