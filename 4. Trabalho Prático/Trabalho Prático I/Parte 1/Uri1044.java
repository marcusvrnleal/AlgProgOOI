import java.util.Scanner;
public class Uri1044{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		
		int numA = teclado.nextInt();
		int numB = teclado.nextInt();
		if((numA % numB == 0) || (numB % numA == 0)){
			System.out.print("São Multiplos\n");
		}else{
			System.out.print("Não sao Multiplos\n");
		}
	}
}