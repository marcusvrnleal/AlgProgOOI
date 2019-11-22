import java.util.Scanner;
public class Troco{
	public static void main (String [] args){
		Scanner teclado = new Scanner (System.in);
		float devido, inserido, troco;
		int trocoCent, moeda1, moeda50, moeda25, moeda10, moeda5;

		System.out.println("Por favor, digite o valor devido em reais: ");
		devido = teclado.nextFloat();

		System.out.println("Por favor, digite o valor inserido em reais: ");
		inserido = teclado.nextFloat();

		troco = inserido - devido;

		trocoCent = (int) (troco * 100); //,00

		moeda1 = trocoCent / 100;        // Parte inteira (quantidade de moedas)
		trocoCent = trocoCent % 100;     // Resto (o que ainda vai faltar de troco)

		moeda50 = trocoCent / 50;
		trocoCent = trocoCent % 50;

		moeda25 = trocoCent / 25;
		trocoCent = trocoCent % 25;

		moeda10 = trocoCent / 10;
		trocoCent = trocoCent % 10;

		moeda5 = trocoCent / 5;

		System.out.printf("O troco é de R$%.2f.\n", troco);
		System.out.printf("Serão dadas %d moedas de R$1,00; %d moedas de R$0,50; %d moedas de R$0,25; %d moedas de R$0,10; e %d moedas de R$0,05.\n", moeda1, moeda50, moeda25, moeda10, moeda5);

	}
}