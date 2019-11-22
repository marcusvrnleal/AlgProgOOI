    /*4. Faça um algoritmo que receba o salário de um funcionário, calcule e mostre seu novo salário,
sabendo-se que este teve um aumento de 25%.
*/

import java.util.Scanner;

public class Exer04 {
    public static final double aumento = 0.25;

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor informe o seu Salário: ");
        double salario = teclado.nextDouble();

        double novoSalario = salario + (salario * aumento);

        System.out.printf("Seu aumento foi de: %.2f\n", novoSalario);
        teclado.close();
    }
}