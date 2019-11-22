import java.util.Scanner;
public class AlunoTeste{
	public static void main (String [] args){
		Scanner teclado = new Scanner(System.in);
		Aluno a1 = new Aluno(), a2 = new Aluno();
		a1.imprimeResumo();

		a1.nome = "Jose Arruela";
		a1.rga  = 1234;
		a1.curso = "ES";

		a1.imprimeResumo();

		a2.nome = teclado.nextLine();
		a2.rga = teclado.nextInt();
		teclado.nextLine();
		a2.curso = teclado.nextLine();

		a2.imprimeResumo();
		System.out.println("CHAMEI AQUI: " + a2.getNome());

	}
}