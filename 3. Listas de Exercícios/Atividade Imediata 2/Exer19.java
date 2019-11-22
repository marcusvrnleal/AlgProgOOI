
/*19. Faça um programa que receba o custo de organização de um espetáculo teatral e o preço do
convite deste espetáculo. Em seguida, mostre quantos ingressos deveriam ser vendidos de
maneira que a organização deste evento não tenha prejuı́zos.*/

import java.util.Scanner;

public class Exer19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o custo do espetáculo: ");
        double custoEsp = teclado.nextDouble();

        System.out.println("Insira o valor do convite: ");
        double precoConv = teclado.nextDouble();

        double qtdConvite = (custoEsp / precoConv);

        System.out.printf("O mínimo de convites vendidos deve ser de: %f\n", qtdConvite);

        teclado.close();
    }
}