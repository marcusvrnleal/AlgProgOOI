import java.util.Scanner;
public class Uri1983{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int alunos, numMaior = 0, numAtual;
        alunos = teclado.nextInt();
		double notaMaior = 0, notaAtual;
		while(alunos-- > 0){
			numAtual = teclado.nextInt();
			notaAtual = teclado.nextDouble();
			if(notaAtual > notaMaior){
				notaMaior = notaAtual;
				numMaior = numAtual;
			}
		}
		if(notaMaior < 8)
			System.out.println("Minimum note not reached");
		else
			System.out.println(numMaior);
    }
}