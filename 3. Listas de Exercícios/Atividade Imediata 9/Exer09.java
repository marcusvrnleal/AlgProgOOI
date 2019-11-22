
/**
Autor: Marcus Vinicius Romero Nobre Leal
Email: marcusvrnleal84@gmail.com
RGA:2017.1906.120-3
Atividade Imediata 9
Ultima Modificação: 11/04/2019
*/

import java.util.Scanner;

public class Exer09 {

    public static void main (String [] args){
		Scanner teclado = new Scanner(System.in);
		int numero, numDivisores;
		System.out.println("Por favor, digite o numero inteiro a ser testado: ");
		numero = teclado.nextInt();
		numDivisores = 0;
		for(int divisor = 2; divisor < Math.sqrt(numero) && numDivisores == 0; divisor++){
			if(numero % divisor == 0)
				numDivisores++;
		}
		if(numDivisores > 0)
			System.out.println("O numero " + numero + " nao e primo.");
		else
			System.out.println("O numero " + numero + " e primo.");
	}
		
}