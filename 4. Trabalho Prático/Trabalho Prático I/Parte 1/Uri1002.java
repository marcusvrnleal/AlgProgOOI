import java.util.Scanner;
public class Uri1002{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		double raio, area;
		raio = teclado.nextDouble();
		area = 3.14159 * (Math.pow(raio,2));
		System.out.printf("A=%.4f\n", area);

		teclado.close();
	}
}