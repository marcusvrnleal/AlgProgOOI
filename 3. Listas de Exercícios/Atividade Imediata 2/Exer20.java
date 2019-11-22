
/* 20. Em uma máquina de refrigerante, aceitam-se moedas de 1 real, 50 centavos, 25 centavos, 10
centavos e 5 centavos. Escreva um programa que auxilie na emissão do troco dessa máquina.
Peça ao usuário que digite o valor devido e o valor inserido na máquina. Em seguida, mostre
quantas moedas de cada um dos tipos acima listados devem ser liberadas para o troco.
Assuma que todos os valores são múltiplos de 5 centavos.*/

import java.util.Scanner;

public class Exer20 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor inserido: ");
        double inserido = teclado.nextDouble();

        System.out.println("Digite o valor devido: ");
        double devido = teclado.nextDouble();

        int troco = (int) ((inserido*100) - (devido*100));
        System.out.println("\nTroco Inicial = " + troco);

        int quantM1, quantM50, quantM25, quantM10, quantM5;

        quantM1 = troco / 100;
        troco -= quantM1 * 100;

        quantM50 = troco / 50;
        troco -= quantM50 * 50;

        quantM25 = troco / 25;
        troco -= quantM25 * 25;

        quantM10 = troco / 10;
        troco -= quantM10 * 10;

        quantM5 = troco / 5;
        troco -= quantM5 * 5;

        System.out.println("Troco Final = " + troco);

        System.out.println("Quantidades de moedas de 1  reais = " + quantM1);
        System.out.println("Quantidades de moedas de 50 centavos = " + quantM50);
        System.out.println("Quantidades de moedas de 25 centavos = " + quantM25);
        System.out.println("Quantidades de moedas de 10 centavos = " + quantM10);
        System.out.println("Quantidades de moedas de  5 centavos = " + quantM5);

    }

}