import java.util.Scanner;
public class CampeonatoVolei{
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		int idade, menores18, maisQue80Quilos;
		float peso, altura, mediaIdade, mediaAlturas;

		menores18 = 0;
		maisQue80Quilos = 0;
		mediaAlturas = 0;

		for(int i = 1; i <= 2; i++){ // Percorre TODAS as equipe
		 	mediaIdade = 0;
		 	for(int j = 1; j <= 2; j++){ // Percorrer os jogadores de UMA equipe
		 		System.out.printf("Por favor, digite a idade, o peso e a altura do jogador %d da equipe %d: \n", j, i);
		 		idade  = teclado.nextInt();
		 		peso   = teclado.nextFloat();
		 		altura = teclado.nextFloat();
		 		
		 		// Letra a)
		 		if(idade < 18)
		 			menores18++;

		 		// Letra b)
		 		mediaIdade += idade;

		 		// Letra c)
		 		mediaAlturas += altura;

		 		// Letra d)
		 		if(peso > 80)
		 			maisQue80Quilos++;
		 	}
		 	mediaIdade /= 2;
		 	System.out.printf("A equipe %d tem media de idade %.2f.\n", i, mediaIdade);	 	
		}
		System.out.printf("Existem %d jogadores com menos de 18 anos.\n", menores18);
		System.out.printf("A media das alturas dos jogadores eh de %.2f metros.\n", (mediaAlturas/10));
		System.out.printf("Existem %.2f %% de jogadores com mais de 80kg.\n", (maisQue80Quilos*10.0f));

	}
}