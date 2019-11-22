/*16. Cada degrau de uma escada tem X cm de altura. Escreva um programa que receba essa
altura dos degraus e a altura, em metros, que o usuário deseja atingir. Em seguida, mostre
quantos degraus o usuário deverá subir para atingir a altura desejada.*/

import java.util.Scanner;

public class Exer16{
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);

        System.out.println("Informe a altura da escada em centimetro: ");
        double alturaCm =  teclado.nextDouble();

        System.out.println("Agora informe a altura da escada em metros: ");
        double alturaMetros = teclado.nextDouble();
        double degraus = (alturaMetros*100)/alturaCm;

        System.out.printf("A quantidade de degraus é: %.2f\n", degraus);
        teclado.close();
    }
}