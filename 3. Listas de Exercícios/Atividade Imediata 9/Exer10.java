/**
Autor: Marcus Vinicius Romero Nobre Leal
Email: marcusvrnleal84@gmail.com
RGA:2017.1906.120-3
Atividade Imediata 9
Ultima Modificação: 05/04/2019
*/

import java.util.Scanner;
public class Exer10 {

    public static void main (String [] args){
		Scanner teclado = new Scanner (System.in);
		String frase;
		boolean ehPalindromo = true;
		System.out.println("Por favor, digite a frase a ser verificada: ");
		frase = teclado.nextLine();

        //Inverte a palavra na variavel resultado
		for(int cont = 0; cont < frase.length() / 2 && ehPalindromo; cont++){
			if (frase.charAt(cont) != frase.charAt(frase.length()-cont-1))
				ehPalindromo = false;
        }
        //Saída dos dados processados
		if(ehPalindromo)
			System.out.println("É um palindromo!");
		else
			System.out.println("Não é um palindromo");
	}
}