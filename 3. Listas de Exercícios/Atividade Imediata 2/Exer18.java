
/*18. Escreva um programa que receba um valor correspondente à quantidade em segundos e
exiba, ao final, os valores correspondentes em horas, minutos e segundos.*/

import java.util.Scanner;

public class Exer18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um valor em segundos");
        int seg = teclado.nextInt();
        int horas = seg / 3600;
        seg = seg % 3600;
        int min = seg / 60;
        seg = seg % 60;

        System.out.printf("%dh : %dm :%ds \n", horas, min, seg);
        teclado.close();
    }
}