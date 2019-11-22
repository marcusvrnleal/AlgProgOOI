import java.util.Scanner;
public class Uri1072{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int valorX, out = 0, in = 0, num;
        int intervaloInicio = 10, interlvaloFinal = 20;
        num = teclado.nextInt();
        for (int i = 1; i <= num; i++) {
            valorX = teclado.nextInt();
            if ((valorX >= intervaloInicio) && (valorX <= interlvaloFinal) ) {
                in += 1;
            }
            else{
                out += 1;
            }
        }
        System.out.print(in + " in\n" + out + " out\n");

    }
}