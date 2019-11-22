import java.util.Scanner;
public class Exer12{
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe uma medidas em pés: ");
		double medidaPes = teclado.nextDouble();

		double medidaPolegada = (12*medidaPes);
		double medidaJarda = (medidaPes/3);
		double medidaMilha = (medidaJarda/1760);
		

		System.out.printf("Medida em Pés: %.6f\n" , medidaPes);
		System.out.printf("Medida em Polegadas: %.6f\n", medidaPolegada);
		System.out.printf("Medida em Jardas: %.6f\n", medidaJarda);
		System.out.printf("Medida em Mihas:  %.6f\n", medidaMilha);

		teclado.close();
	}
	
}