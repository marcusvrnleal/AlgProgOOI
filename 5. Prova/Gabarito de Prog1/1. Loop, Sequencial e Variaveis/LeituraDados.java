import java.util.Scanner;
public class LeituraDados
{
	public static void main (String [ ] args)
	{
		Scanner teclado = new Scanner(System.in);
		int primInteiro, segInteiro;
		double primDouble, segDouble;
		String primString, segString;
		
		System.out.print("Digite dois número inteiros");
		System.out.println(" separados por espaços:");
		primInteiro = teclado.nextInt();
		segInteiro  = teclado.nextInt();
		System.out.println("Números digitados: " + primInteiro + " e " + segInteiro);
		
		teclado.nextLine(); // LIMPA O BUFFER

		System.out.println("Agora, digite dois números com parte decimal: ");
		primDouble = teclado.nextDouble();
		segDouble  = teclado.nextDouble();
		System.out.println("Números digitados: " + primDouble + " e " + segDouble);
		
		System.out.println("Agora, digite duas palavras: ");
		primString = teclado.next();
		segString  = teclado.next();	
		System.out.println("Palavras digitadas: " + primString + " e " + segString);

		System.out.println("Agora, digite uma linha de texto: ");
		primString = teclado.nextLine();
		System.out.println("Texto digitado: " + primString);
	
	}
}
