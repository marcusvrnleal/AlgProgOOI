import java.util.Scanner;
public class VetorSoma{
	public static void main(String [] args){
		Scanner teclado = new Scanner (System.in);
		float [] vetA = new float[10],
		         vetB = new float[10];
		float soma;

		System.out.println("Por favor, digite os 10 valores do primeiro vetor: ");
		for(int i = 0; i < vetA.length; i++)
			vetA[i] = teclado.nextFloat();

		for(int i = 0; i < vetB.length; i++){ // Para cada posicao do vetor B
			soma = 0;
			for(int j = i; j < vetA.length; j++){ // Soma A de i até o final
				soma += vetA[j];
			}
			vetB[i] = soma;
			System.out.print(vetB[i] + "\t");
		}
		System.out.println();
	}
}