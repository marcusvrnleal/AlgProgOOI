    /* 6. Faça um programa que calcule e mostre a tabuada de um determinado número inteiro
digitado pelo usuário.
*/
import java.util.Scanner;

public class Exer06{
    public static void main(String []args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número para sua tabuada: ");
        int n = teclado.nextInt();
        System.out.println();
        System.out.println(n + " * 0" + " = " + (n*0));
        System.out.println(n + " * 1" + " = " + (n*1));
        System.out.println(n + " * 2" + " = " + (n*2));
        System.out.println(n + " * 3" + " = " + (n*3));
        System.out.println(n + " * 4" + " = " + (n*4));
        System.out.println(n + " * 5" + " = " + (n*5));
        System.out.println(n + " * 6" + " = " + (n*6));
        System.out.println(n + " * 7" + " = " + (n*7));
        System.out.println(n + " * 8" + " = " + (n*8));
        System.out.println(n + " * 9" + " = " + (n*9));
        System.out.println(n + " * 10" + " = " + (n*10));
        System.out.println();
        teclado.close();
    }
}