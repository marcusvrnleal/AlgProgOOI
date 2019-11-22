    /* 5. Escreva um algoritmo que receba o salário de um funcionário e o seu percentual de aumento.
Calcule e mostre seu novo salário.
*/

import java.util.Scanner;

public class Exer05{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor insire o seu salário inicial");
        double salario = teclado.nextDouble();

        System.out.println("Agora, informe o percentual de aumento");
        double aumento = teclado.nextDouble();

        double novoSalario = salario + (salario *aumento /100);

        System.out.println("O seu novo salário é: " + novoSalario);
        teclado.close();
    }

}