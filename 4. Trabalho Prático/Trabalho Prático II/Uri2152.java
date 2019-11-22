import java.util.Scanner;

public class Uri2152{

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int qtdTeste = teclado.nextInt();
		int h, m, porta;
		for(int i=0 ; i<qtdTeste ; i++){
            
            h = teclado.nextInt();
			m = teclado.nextInt();
            porta = teclado.nextInt();

			if(porta==1)
				System.out.printf("%02d:%02d - A porta abriu!\n",h,m);
			else
				System.out.printf("%02d:%02d - A porta fechou!\n",h,m);				
		}
		teclado.close();
	}
}