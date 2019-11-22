import java.util.Scanner;
public class TesteString{
	public static final int POSICAO_INICIAL = 1;
	public static void main (String [] a){
		Scanner teclado = new Scanner (System.in);
		String frase = "A melhor disciplina é a de Algoritmos e Programação Orientada a Objetos I com o professor Bruno Nogueira!";
		int tamanho = frase.length();
		int posicao;
		System.out.println("Digite a posição final: ");
		posicao = teclado.nextInt();

		String subfrase = frase.substring(POSICAO_INICIAL,posicao);

		// POSICAO_INICIAL = 2;   ERRO!
		System.out.println(tamanho);
		System.out.println(subfrase);

		String novaString = "Programar", novaString2 = "programar";
		boolean resp = novaString.equals(novaString2);
		System.out.println("Resposta do equals: " + resp);

		resp = novaString.equalsIgnoreCase(novaString2);
		System.out.println("Resposta do equalsIgnoreCase: " + resp);
	}
}




