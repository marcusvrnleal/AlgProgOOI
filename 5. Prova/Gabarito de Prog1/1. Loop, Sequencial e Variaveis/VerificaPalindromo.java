import java.util.Scanner;
public class VerificaPalindromo{
	public static void main (String [] args){
		Scanner teclado = new Scanner (System.in);
		String frase;
		boolean ehPalindromo = true;
		System.out.println("Por favor, digite a frase a ser verificada: ");
		frase = teclado.nextLine();

		for(int cont = 0; cont < frase.length() / 2 && ehPalindromo; cont++){
			if (frase.charAt(cont) != frase.charAt(frase.length()-cont-1))
				ehPalindromo = false;
		}
		if(ehPalindromo)
			System.out.println("Eh palindromo!");
		else
			System.out.println("Nao eh palindromo");
	}
}