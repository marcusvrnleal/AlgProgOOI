import java.util.Scanner;
public class AnoBissexto{
	public static void main (String [] args){
		Scanner teclado = new Scanner(System.in);
		int dia = teclado.nextInt(), 
		    mes = teclado.nextInt(), 
		    ano = teclado.nextInt();

		// Primeiro filtro de datas invalidas
		if(dia <= 0 || dia >= 32 || mes <= 0 || mes >= 13 || ano < 1){
			System.out.println("Data invalida!");
		}
		else{
			switch (mes){
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					System.out.println("A data eh valida!");
					break;
				case 4: case 6: case 9: case 11:
					if(dia <= 30)
						System.out.println("A data eh valida!");
					else
						System.out.println("A data eh invalida!");
					break;
				case 2:
					if(dia <= 28)
						System.out.println("A data eh valida!");
					else if (dia == 29 && ano % 4 == 0)
						System.out.println("A data eh valida!");
					else // dia 30 ou 31 OU dia 29 em anos nao bissextos
						System.out.println("A data eh invalida!");
					break;
			}

		}

	}
}