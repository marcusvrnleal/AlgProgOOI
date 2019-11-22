/*12. Sabe-se que 1 pé é igual a 12 polegadas; 1 jarda = 3 pés; e 1 milha = 1760 jardas. Mostre
um algoritmo que receba uma medida em pés, faça as conversões e mostre os resultados em
polegadas, jardas e milhas.*/

import java.util.Scanner;

public class Exer12{
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a medida em pés: ");
        double pes = teclado.nextDouble();


        double polegadas = 12*pes;
        double jarda = pes/3;
        double milha = (jarda/1760);
        System.out.printf("Pés: %.2f\n", pes);
        System.out.printf("Polegadas: %.2f\n", polegadas);
        System.out.printf("Jardas: %.2f\n", jarda);
        System.out.printf("Milhas: %f\n", milha);
        teclado.close();
    }
}