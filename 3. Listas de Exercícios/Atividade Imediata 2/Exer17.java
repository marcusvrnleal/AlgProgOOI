
/*17. Uma pessoa deseja pregar um quadro em uma parede. Faça um programa que calcule e
mostre a distância em que a escada deve estar da parede, considerando que o tamanho
da escada seja maior que a altura que se deseja alcançar. Considere, ainda, que a escada
deve apoiar-se na exata altura em que deseja-se pregar o quadro. O usuário deve digitar o
tamanho da escada e a altura em que deseja pregar o quadro.*/

import java.util.Scanner;

public class Exer17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com o tamanho da escada: ");
        double aEscada = teclado.nextDouble();

        System.out.println("Digite a altura em que deseja pregar o quadro:");
        double aQuadro = teclado.nextDouble();

        double distancia = Math.sqrt(aEscada) - Math.sqrt(aQuadro);
        System.out.printf("A distancia em que a escada deverá ficar é de: %.2f\n", distancia);

        teclado.close();
    }
}