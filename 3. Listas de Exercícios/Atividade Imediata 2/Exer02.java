    /* 2. Mostre um algoritmo que receba três notas, calcule e exiba a média aritmética das mesmas.
    */
import java.util.Scanner;
 
public class Exer02{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor informe as três notas: ");
        double nota1 = teclado.nextDouble();
        double nota2 = teclado.nextDouble();
        double nota3 = teclado.nextDouble();

        double ma = (nota1 + nota2 + nota3)/3;

        System.out.println("A média aritmética é: ");
        System.out.println(ma);
        teclado.close();
    }
}