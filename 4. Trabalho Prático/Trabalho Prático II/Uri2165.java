import java.util.Scanner;

public class Uri2165 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
        String twit = teclado.nextLine();
        
		if (twit.length()<=140)
			System.out.println("TWEET");
		else
			System.out.println("MUTE");

		teclado.close();
	}
}