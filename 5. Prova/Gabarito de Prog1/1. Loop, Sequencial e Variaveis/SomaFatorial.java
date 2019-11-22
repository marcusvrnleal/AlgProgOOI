import java.util.Scanner;
public class SomaFatorial{
	public static void main (String [] args){
		Scanner teclado = new Scanner (System.in);
		int numeroFinal = teclado.nextInt();
		double somaFatorial = 1;
		long fatorialAtual = 1l;
		
		for(int cont = 1; cont <= numeroFinal; cont++){ // fatorialAtual = 1
			fatorialAtual = cont * fatorialAtual;
			somaFatorial += 1.0 / fatorialAtual;
		}
		System.out.printf("Valor final: %.50f\n", somaFatorial);
	}
}