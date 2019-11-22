/**
Autor: Marcus Vinicius Romero Nobre Leal
Email: marcusvrnleal84@gmail.com
RGA:2017.1906.120-3
Atividade Imediata 9
Ultima Modificação: 11/04/2019
*/

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Declaração e leitura das variaveis
		System.out.println("Informe três números em ordem crescentes: ");
		int numA = teclado.nextInt();
		int numB = teclado.nextInt();
		int numC = teclado.nextInt();

		System.out.println(); // pular linha
		System.out.println("Números ordem decrescente: "); // Saida em ordem decrescente.

		// Comparando os 3 números
		if (numA > numB && numA > numC) { // Verifica se A é o maior
			System.out.println(numA);

			if (numB > numC) { // comparando se o B é maior que o C.
				// Saida da comparação do numero B e do C.
				System.out.println(numB);
				System.out.println(numC);
			} else {
				System.out.println(numC);
				System.out.println(numB);
			}
		} else if (numB > numC) { // Sabemos que A não é o maior, verificar se B ou C é o maior
			System.out.println(numB);
			if (numA > numC) {  // Verificação do segundo maior
				// Saida da comparação do numero A e do C.
				System.out.println(numA);
				System.out.println(numC);
			} else { // Se A nem B é o maior, C é !
				System.out.println(numC);
				System.out.println(numA);
			}
		} else { // Se A nem B é o maior, C é !
			System.out.println(numC);
			if (numB > numA) {
				// Saida da comparação A e B
				System.out.println(numB);
				System.out.println(numA);
			} else {
				System.out.println(numA);
				System.out.println(numB);
			}
		}
		teclado.close(); //fechamento do teclado
	}
}