import java.util.Scanner;
public class MultiplicaMatriz{
	public static void main (String [] args){

		Scanner teclado = new Scanner (System.in);
		int nLin1, nLin2, nCol1, nCol2;
		double [][] mat1, mat2, matRes;

		System.out.println("Por favor, digite as dimensoes da primeira matriz (numero de linhas e colunas, nesta ordem):");
		nLin1 = teclado.nextInt();
		nCol1 = teclado.nextInt();

		System.out.println("Por favor, digite as dimensoes da segunda matriz (numero de linhas e colunas, nesta ordem):");
		nLin2 = teclado.nextInt();
		nCol2 = teclado.nextInt();

		// Eh possivel fazer a multiplicacao
		if(nCol1 == nLin2){
			mat1 = new double[nLin1][nCol1];
			mat2 = new double[nLin2][nCol2];
			matRes = new double[nLin1][nCol2];

			System.out.println("Por favor, digite os valores da matriz 1: ");
			for(int i = 0; i < mat1.length; i++)
				for(int j = 0; j < mat1[i].length; j++)
					mat1[i][j] = teclado.nextDouble();

			System.out.println("Por favor, digite os valores da matriz 2: ");
			for(int i = 0; i < mat2.length; i++)
				for(int j = 0; j < mat2[i].length; j++)
					mat2[i][j] = teclado.nextDouble();

			for(int i = 0; i < matRes.length; i++){ // Percorrer as linhas da matriz resultante
				for(int j = 0; j < matRes[i].length; j++){ // Percorrer as colunas da matriz resultante
					for(int k = 0; k < mat1[0].length; k++){
						matRes[i][j] += mat1[i][k] * mat2[k][j];
					}
					System.out.print(matRes[i][j] + "\t");
				}
				System.out.println();
			}
		}
		else
			System.out.println("Impossivel calcular!");
	}
}