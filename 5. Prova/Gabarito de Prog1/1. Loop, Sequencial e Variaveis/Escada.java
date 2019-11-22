import java.util.Scanner;
public class Escada{
	public static void main (String [] args){
		Scanner teclado = new Scanner (System.in);
		float altEscada, altQuadro; 
		double distancia;

		System.out.println("Por favor, digite a altura do quadro (em metros): ");
		altQuadro = teclado.nextFloat();

		System.out.println("Por favor, digite a altura da escada (em metros): ");
		altEscada = teclado.nextFloat();

		distancia = Math.sqrt(altEscada * altEscada - altQuadro * altQuadro);

		//System.out.println("A escada deve estar a " + distancia + " metros da parede.");
		System.out.printf("A escada tem %.2f metros e deve estar a %.2f metros da parede.\n", altEscada, distancia);
	}
}







