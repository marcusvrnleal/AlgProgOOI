import java.util.Scanner;

public class Uri2061{

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		int N = teclado.nextInt();
		int M = teclado.nextInt();
		
		teclado.nextLine();

		if (N>0 && M<500){
			
			String acao = "";
			int abas=N;
			for (int i=0 ; i<M ; i++){
				acao = teclado.nextLine();
				if (acao.equals("fechou"))
					abas++;
				if (acao.equals("clicou"))
					abas--;
			}
			System.out.println(abas);
		}
		teclado.close();
	}
}