/*11. Faça um programa que receba dois números maiores que zero e mostre os valores resultantes
da exponenciação entre eles (primeiro elevado ao segundo e segundo elevado ao primeiro).*/

import java.util.Scanner;
public class Exer11{
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int num1 = teclado.nextInt();

        System.out.println("Agora informe o segundo número: ");
        int num2 = teclado.nextInt();
        double result;
        result = Math.pow(num1,num2);
        System.out.println("O número " + num1 + " elevado a "+ num2 + " é: " + result);

        teclado.close();
    }
}