import java.util.Scanner;
public class Exer13{
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o seu ano de Nascimento: ");
		int anoNascimeto = teclado.nextInt();

		System.out.println("Informe o ano atual: ");
		int idadePresente = teclado.nextInt();
		idadePresente = (idadePresente- anoNascimeto);
		int idadeFutura = (2050 - anoNascimeto);

		System.out.println("Seu ano de Nascimento é: " + anoNascimeto);
		System.out.println("Sua idade Presente é: " + idadePresente + " anos.");
		System.out.println("Sua idade em 2050 será: "+ idadeFutura + " anos.");
		teclado.close();
	}
}