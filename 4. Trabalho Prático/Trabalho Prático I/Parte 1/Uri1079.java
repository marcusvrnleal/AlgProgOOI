import java.util.Scanner;
public class Uri1079{
	public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int numTeste = teclado.nextInt();

        for(int i = 0; i<numTeste; i++){
        	double x, y, z;
			double num1 = teclado.nextDouble();
			double num2 = teclado.nextDouble();
			double num3 = teclado.nextDouble();
            System.out.printf("%.1f\n", (num1 * 2 + num2 * 3 + num3 * 5)/10);
        }
    }
}