import java.util.Scanner;
public class Exer16{
	public static void main (String [] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a altura da escada em centimetro: ");
		double alturaCM = teclado.nextDouble();
		System.out.println("Agora informe a altura da escada em metros: ");
		double alturaMetros = teclado.nextDouble();
		double degraus = (alturaMetros*100)/alturaCM;
		System.out.printf("A quantidade de degraus é: %.2f\n", degraus);
		teclado.close();
	}
}