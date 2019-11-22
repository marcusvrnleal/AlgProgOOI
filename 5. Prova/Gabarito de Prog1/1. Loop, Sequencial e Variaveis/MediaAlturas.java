import java.util.Scanner;
public class MediaAlturas{
	public static void main (String [] args){
		Scanner teclado = new Scanner (System.in);
		int idade, cont;
		float altura, mediaAlturas;

		cont = 0;
		mediaAlturas = 0;
		do{
			System.out.println("Por favor, digite a idade e a altura da pessoa: ");
			idade = teclado.nextInt();
			altura = teclado.nextFloat();

			if(idade > 50){
				mediaAlturas += altura;
				cont++;
			}
		} while(idade > 0);

		if(cont > 0)
			System.out.printf("A media das alturas das pessoas com mais de 50 anos eh %.1f.\n", (mediaAlturas / cont));
		else
			System.out.println("Nao ha pessoas com mais de 50 anos.");
	}
}