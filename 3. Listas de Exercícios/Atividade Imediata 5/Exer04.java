import java.util.Scanner;

public class Exer04{
	public static final double Aumento = 0.25;
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);

		System.out.println("Porfavor! Informe o seu salário: ");
		double salarioInicial = teclado.nextDouble();

		double salarioFinal = salarioInicial+(salarioInicial*Aumento);

		System.out.printf("Seu novo salário será: %.2f\n", salarioFinal);

		teclado.close();
	}

}