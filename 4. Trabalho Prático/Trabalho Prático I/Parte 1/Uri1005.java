import java.util.Scanner;
public class Uri1005{
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		
		double notaA = teclado.nextDouble();
		double notaB = teclado.nextDouble();
		double med = ((notaA * 3.5) + (notaB * 7.5))/11;
		
		System.out.printf("MEDIA = %.5f\n", med);

		teclado.close();
	}
}