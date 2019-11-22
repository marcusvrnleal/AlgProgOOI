import java.util.Scanner;
public class Uri1038{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
	
		double valor, total;
		int codigo = teclado.nextInt();
        int qtd = teclado.nextInt();
        
		switch(codigo){
			case 1:
				valor = 4;
				total = qtd * valor;
				System.out.print("Total: R$ ");
				System.out.printf("%.2f", total);
				System.out.print("\n");
				break;
			case 2:
				valor = 4.5;
				total = qtd * valor;
				System.out.print("Total: R$ ");
				System.out.printf("%.2f", total);
				System.out.print("\n");
				break;
			case 3:
				valor = 5;
				total = qtd * valor;
				System.out.print("Total: R$ ");
				System.out.printf("%.2f", total);
				System.out.print("\n");
				break;
			case 4:
				valor = 2;
				total = qtd * valor;
				System.out.print("Total: R$ ");
				System.out.printf("%.2f", total);
				System.out.print("\n");
				break;
			case 5:
				valor = 1.5;
				total = qtd * valor;
				System.out.print("Total: R$ ");
				System.out.printf("%.2f", total);
				System.out.print("\n");
				break;
			default:
				break;
		}
		
	}
}