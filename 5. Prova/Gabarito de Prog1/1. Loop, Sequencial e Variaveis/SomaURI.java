import java.util.Scanner; // Torna o programa apto a interagir com o usuário

public class SomaURI{
	public static void main (String [] args){
		Scanner teclado = new Scanner (System.in); // Habilita o meu teclado
		int num1, num2, resultado;
		num1 = teclado.nextInt(); // Lê um valor inteiro e armazena em num1
		num2 = teclado.nextInt(); // Lê um valor inteiro e armazena em num2
		resultado = num1 + num2;
		System.out.println("X = " + resultado);
	}
}