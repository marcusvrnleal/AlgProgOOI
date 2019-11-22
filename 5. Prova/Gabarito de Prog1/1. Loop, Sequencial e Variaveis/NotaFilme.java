import java.util.Scanner;
public class NotaFilme
{
	enum NotaFilmes {E, M, R}   // Possíveis notas
	public static void main (String [ ] args)
	{
		NotaFilmes nota;        // Nota que o usuário dá ao filme
		Scanner teclado = new Scanner (System.in);
		String resp;

		System.out.println("Digite a nota que você dá ao filme:");
		resp = teclado.next();
		if(!(resp.equalsIgnoreCase("e") || resp.equalsIgnoreCase("m") || resp.equalsIgnoreCase("r"))){
			System.out.println("Valor incorreto!");
			System.exit(0);
		}
		nota = NotaFilmes.valueOf(resp.toUpperCase());
		
		switch(nota)
		{
			case E:
				System.out.println("Você tem que assistir a este filme!");
				break;
			case M:
				System.out.println("O filme é bom, assista se tiver tempo!");
				break;
			default:
				System.out.println("Não assista! É pior que Crepúsculo!");
				break;
		}
	}
}
