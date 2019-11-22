import java.util.Scanner;
public class MenorMaiorMedia{
	public static void main (String [] args){
		Scanner teclado = new Scanner(System.in);
		int[] vet = new int[5];
		int menor, maior;
		float media;

		System.out.println("Por favor, digite os valores das 5 posicoes do vetor:");
		for(int i = 0; i < vet.length; i++)
			vet[i] = teclado.nextInt();


		media = vet[0];
		menor = vet[0];
		maior = vet[0];

		for(int i = 1; i < vet.length; i++){
			if(vet[i] > maior)
				maior = vet[i];
			if(vet[i] < menor)
				menor = vet[i];
			media += vet[i];
		}
		media /= vet.length;

		System.out.printf("Menor valor: %d; Maior valor: %d; Media: %.2f.\n", menor, maior, media);
		
	}
}