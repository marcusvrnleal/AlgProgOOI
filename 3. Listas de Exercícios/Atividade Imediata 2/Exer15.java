    /*15. João comprou um saco de ração com peso em quilos. Ele possui dois cachorros, para os
quais fornece a mesma quantidade de ração em gramas. Faça um programa que receba o
peso do saco de ração, a quantidade fornecida para cada cachorro e exiba, ao final, quanto
restará de ração ao final de cinco dias.*/

import java.util.Scanner;
public class Exer15{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o peso do saco de ração (Kg):");
        double pesoRacao = teclado.nextDouble();

        System.out.println("Agora, digite a quantidade de ração fornecida (g): ");
        double qtdRacao = teclado.nextDouble();

        System.out.println(pesoRacao);
        qtdRacao = qtdRacao*2;
        double resultG = (pesoRacao - 5) * qtdRacao;
        double resultKg = ((pesoRacao - 5) * qtdRacao)/1000;

        System.out.printf("Após 5 dias de consumo restar (g): %.2f\n", resultG);
        System.out.printf("Após 5 dias de consumo restar (KG): %.2f\n", resultKg);

        teclado.close();
    }
}