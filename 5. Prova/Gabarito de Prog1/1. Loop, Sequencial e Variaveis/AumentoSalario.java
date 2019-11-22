import java.util.Scanner;

public class AumentoSalario{
	public static void main (String [] args){
		Scanner teclado = new Scanner(System.in);
		float salario, aumento, novo;
		System.out.println("Por favor, digite o salario: ");
		salario = teclado.nextFloat();
		System.out.println("Agora, digite o aumento do salario: ");
		aumento = teclado.nextFloat();
		novo = salario * (1 + aumento / 100);
		System.out.printf("O novo salario eh R$%.2f \n", novo);
		// System.out.println("O novo salario eh R$" + novo);
	}
}
