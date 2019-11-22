import java.util.Scanner;
public class InverteVetor{
	public static void main (String [] args){
		Scanner teclado = new Scanner (System.in);
		int [] vetor = new int[10];
		int aux;
		
		// Preenchimento do vetor - valores digitados pelo usuario
		System.out.println("Por favor, digite 10 valores inteiros: ");
		for(int i = 0; i < vetor.length; i++)
			vetor[i] = teclado.nextInt();

		for(int i = 0; i < vetor.length/2; i++){
			aux = vetor[vetor.length - 1 - i];
			vetor[vetor.length - 1 - i] = vetor[i];
			vetor[i] = aux;
		}

		for(int i = 0; i < vetor.length; i++)
			System.out.print(vetor[i] + "\t");
		System.out.println();
	}
}