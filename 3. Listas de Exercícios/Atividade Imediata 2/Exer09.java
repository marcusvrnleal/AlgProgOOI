
/*9. Um funcionário recebe um valor de salário base bruto, assinado em carteira. Calcule e
mostre o salário lı́quido deste funcionário, sabendo-se que o funcionário tem gratificação de
5% sobre o salário base e paga 7% de imposto calculado, também, sobre o salário base.*/

import java.util.Scanner;

public class Exer09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor informe o seu sálario base.");
        double salarioBase = teclado.nextDouble();
        double gratificação = salarioBase * 5/100;
        double imposto = salarioBase * 7/100;
        double desconto = salarioBase - imposto;
        double novoSalario = desconto + gratificação;

        System.out.printf("O salário do funcionário a receber é: %.2f\n", novoSalario);
        teclado.close();
    }
}