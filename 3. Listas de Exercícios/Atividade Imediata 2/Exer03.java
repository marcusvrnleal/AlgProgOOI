    /*3. Escreva um algoritmo que receba três notas e os seus respectivos pesos. Em seguida, calcule
a média ponderada das mesmas, exibindo-a.
*/
import java.util.Scanner;

public class Exer03{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor digite as tês notas: ");
        double nota1 = teclado.nextDouble();
        double nota2 = teclado.nextDouble();
        double nota3 =  teclado.nextDouble();

        System.out.println("Agora informe os pesos das três notas: ");
        double peso1 = teclado.nextDouble();
        double peso2 = teclado.nextDouble();
        double peso3 = teclado.nextDouble();

        double mp = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)/10);

        System.out.printf("A média ponderada: ");
        System.out.println(mp);
        teclado.close();
    }


}