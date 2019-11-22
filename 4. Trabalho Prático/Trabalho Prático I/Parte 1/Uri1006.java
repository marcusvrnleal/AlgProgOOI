import java.util.Scanner;
public class Uri1006{
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		
		double notaA = teclado.nextDouble();
		double notaB = teclado.nextDouble();
		double notaC = teclado.nextDouble();
		double media = ((notaA * 2) + (notaB * 3) + (notaC * 5))/10;
		
		System.out.printf("MEDIA = %.1f\n", media);

		teclado.close();
	}
}