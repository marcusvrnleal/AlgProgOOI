
/*14. Uma empresa precisa de ajuda para calcular o salário de seus funcionários. Esta empresa
paga metade de um salário base por hora trabalhada. Faça um programa que receba o
salário base e o número horas trabalhadas por um funcionário e exiba, ao final, seu salário
lı́quido, considerando que este funcionário paga 7% de imposto sobre seu salário bruto.*/

import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
        System.out.println("Por favor! Informe o número de horas trabalhadas (Exemplo 60 min.)"); //Quantidade de h.oras trabalhada
        int nunHoras = teclado.nextInt();

        System.out.println("Agora, informe o seu salario minimo: "); // Salario Minimo do Usuario.
        double salMinino = teclado.nextDouble();
       

        double horasTrabalhadas = (salMinino/2);;
        
        double salBruto = (int)horasTrabalhadas * nunHoras;
        double imposto = salBruto*(7/100);
        double salLiquido = salBruto - imposto;

        System.out.printf("Seu salário mínimo é:  %.2f reais.\n" , salMinino);
        System.out.printf("O salário a receber será: %.2f reais.\n" , salLiquido);
        teclado.close();
    }
}