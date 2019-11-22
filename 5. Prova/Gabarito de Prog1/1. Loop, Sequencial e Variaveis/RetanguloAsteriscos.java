import java.util.Scanner;
public class RetanguloAsteriscos{
	public static void main (String [] args){
		Scanner teclado = new Scanner(System.in);
		int nLinhas, nColunas;

		System.out.println("Por favor, digite o numero de linhas e colunas do retangulo");
		nLinhas  = teclado.nextInt();
		nColunas = teclado.nextInt();

		for(int linha = 0; linha < nLinhas; linha++){ // Percorrer as linhas do retângulo
			for(int coluna = 0; coluna < nColunas; coluna++){ // Percorrer as coluna de UMA LINHA
				System.out.print("*");
			}
			System.out.println();
		}
	}
}