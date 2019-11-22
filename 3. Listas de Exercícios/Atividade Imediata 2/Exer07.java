
/*7. Faça um programa que receba o valor de dois ângulos internos de um triângulo e mostre o
valor do terceiro ângulo.*/

import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o primeiro ângulo: ");
        int angulo1 = teclado.nextInt();

        System.out.println("Agora informe o segundo ângulo: ");
        int angulo2 = teclado.nextInt();

        int angulo3 = 180 - (angulo1 + angulo2); // calculo para o terceiro ângulo.

        System.out.println("O valor do terceiro ângulo é: " + angulo3);
        teclado.close();
    }
}