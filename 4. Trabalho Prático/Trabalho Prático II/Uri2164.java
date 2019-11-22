import java.util.Scanner;
public class Uri2164{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		
		
		int n = teclado.nextInt();
		double fibonacci;
		if (n>=0 && n<=50){
			double raiz5 = Math.sqrt(5);
			double conta1 = (1 + raiz5) / 2;
			double elevado1 = Math.pow(conta1,n);
			double conta2 = (1 - raiz5) / 2;
			double elevado2 = Math.pow(conta2,n);
			fibonacci = (elevado1-elevado2)/raiz5;
			
			System.out.printf("%.1f\n",fibonacci);
		}
		teclado.close();
    }
}