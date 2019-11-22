
/* 8. Faça um programa que calcule a área de um losango. Sabe-se que A = (diagonal maior *
diagonal menor) / 2.*/

import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a diagonal maior do losango: ");
        int diagonalMaior = teclado.nextInt();

        System.out.println("Agora informe a diagonal menor do losango:");
        int  diagonalMenor = teclado.nextInt();

        System.out.println("E por fim informe a unidade de medida: ");
        String medida = teclado.next();

        int a = (diagonalMaior * diagonalMenor) / 2;

        System.out.println("A área do losando é: "+ a + " " + medida + ".");
        teclado.close();
    }
}