/*13. Escreva um programa que receba o ano de nascimento de uma pessoa e o ano atual. Em
seguida, mostre a idade dessa pessoa neste ano e a sua idade no ano de 2050.*/

import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe seu ano de nascimento: "); //Ano de Nascimento do Usuario
        int anoNascimento = teclado.nextInt();
        
       
        System.out.println("Agora Informe o seu ano atual: "); // Ano Atual.
        int anoAtual = teclado.nextInt();

        int idadeAtual = (anoAtual - anoNascimento); // Calculo para a idade Presente.
        int idadeFutura = (2050 - anoNascimento); //Calculo para a idade Futura

        System.out.printf("A sua idade atual é: " + idadeAtual + " anos.\n" ); //Saida da idade Presente
        System.out.println("A sua idade em 2050 será de: " +idadeFutura + " anos.\n"); //Saida da idade Futura
        teclado.close();
    }
}