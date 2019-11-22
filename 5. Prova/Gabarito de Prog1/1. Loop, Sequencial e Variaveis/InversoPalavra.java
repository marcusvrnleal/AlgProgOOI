import java.util.Scanner;
public class InversoPalavra{
	public static void main (String [] args){
		Scanner teclado = new Scanner(System.in);
		String palavra = teclado.nextLine(),
		       palavraInvertida = "";

		for(int i = palavra.length() - 1; i >= 0; i--)
			palavraInvertida += palavra.charAt(i);

		System.out.println(palavraInvertida);
	}
}