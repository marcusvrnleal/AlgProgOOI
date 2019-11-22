import java.util.Scanner;

public class Uri2310 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		

		int n = teclado.nextInt();
		String nome = "";
		double saquep=0.0, ataquep=0.0, bloqueiop=0.0;
		double saque=0, bloqueio=0, ataque=0;
		double saqueok=0, bloqueiook=0, ataqueok=0;

		for (int i=0 ; i<n ; i++){
			nome = teclado.next();
			saque += teclado.nextDouble();
			bloqueio += teclado.nextDouble();
			ataque += teclado.nextDouble();
			saqueok += teclado.nextDouble();
			bloqueiook += teclado.nextDouble();
			ataqueok += teclado.nextDouble();
			
		}
		saquep = saqueok * 100.00 / saque;
		bloqueiop = bloqueiook * 100.00 / bloqueio;
		ataquep = ataqueok * 100.00 / ataque;

		System.out.printf("Pontos de Saque: %.2f %%.\n",saquep);
		System.out.printf("Pontos de Bloqueio: %.2f %%.\n",bloqueiop);
		System.out.printf("Pontos de Ataque: %.2f %%.\n",ataquep);
		
		teclado.close();
	}
}