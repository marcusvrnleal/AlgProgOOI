import java.util.Scanner;

public class Uri1153 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int n, fat=1;

		n = teclado.nextInt();
		
		while (n >= 13 || n <= 0){
			n = teclado.nextInt();
		}
		
		for (int aux = n; aux > 0; aux--){
			fat = fat * aux;
		}
		System.out.println(fat);
		teclado.close();
	}
}