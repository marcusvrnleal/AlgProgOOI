import java.util.Scanner;
public class IntervaloDesvio{
	public static void main (String [] args){
		Scanner teclado = new Scanner(System.in);
		int tamanhoVetor;
		double media = 0.0;
		double [] valor;
		double desvio = 0.0;

		System.out.println("Por favor, querido usuario, digite o tamanho do vetor: ");
		tamanhoVetor = teclado.nextInt();

		// Inicializando o vetor
		valor = new double[tamanhoVetor];
		System.out.println("Por favor, digite os valores a serem armazenados no vetor: ");
		for(int i = 0; i < valor.length; i++){
			valor[i] = teclado.nextDouble();
			media += valor[i];
		}

		// Calcular a media
		media /= valor.length;

		// Calcular o desvio padrao
		for(int i = 0; i < valor.length; i++)
			desvio += Math.pow((valor[i] - media), 2); // Eleva ao quadrado
		desvio /= valor.length;
		desvio = Math.sqrt(desvio);
		
		System.out.printf("Media: %f\n Desvio: %f\n", media, desvio);

		for(int i = 0; i < valor.length; i++){
			if(valor[i] >= (media - desvio) && valor[i] <= (media + desvio))
				System.out.printf("O numero %f esta dentro do intervalo [%f , %f].\n", valor[i], (media-desvio), (media+desvio));
		}

	}
}