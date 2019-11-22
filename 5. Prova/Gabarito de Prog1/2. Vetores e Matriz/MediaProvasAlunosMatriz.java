import java.util.Scanner;
public class MediaProvasAlunosMatriz
{
	public static void main (String [] args)
	{
		Scanner teclado = new Scanner(System.in);
		double [][] notas;
		int numAlunos = 4, numProvas = 3;
		float media;
		
		notas = new double [numAlunos][numProvas]; // Linhas - Alunos; Colunas - Provas
		
		for(int i = 0; i < notas.length; i++){
			for(int j = 0; j < notas[i].length; j++){
				System.out.println("Digite a nota " + (j+1) + " do aluno " + (i+1) + ":");
				notas[i][j] = teclado.nextDouble();
			}
		}

//		for(int i = 0; i < notas.length; i++){
//			System.out.print("Notas do aluno " + (i+1) + ":\t");
//			for(int j = 0; j < notas[i].length; j++){
//				System.out.print(notas[i][j] + "\t");
//			}
//			System.out.println();
//		}

		// Calculo da media por aluno
		for(int i = 0; i < notas.length; i++){ // Percorrendo as linhas
			media = 0;
			System.out.print("Notas do aluno " + (i+1) + ":\t");
			for(int j = 0; j < notas[i].length; j++){ // Percorrendo as colunas de uma linha
				System.out.print(notas[i][j] + "\t");
				media += notas[i][j];
			}
			System.out.println("Media do aluno " + (i + 1) + ": " + (media / notas[i].length));
		}

		// Calculo da media por prova
		for(int j = 0; j < notas[0].length; j++){
			media = 0;
			System.out.print("Notas da prova " + (j+1) + ":\t");
			for(int i = 0; i < notas.length; i++){
				System.out.print(notas[i][j] + "\t");
				media += notas[i][j];
			}
			System.out.println("Media da prova " + (j + 1) + ": " + (media / notas.length));
		}

	}
}
