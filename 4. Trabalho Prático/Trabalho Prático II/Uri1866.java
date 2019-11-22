import java.util.Scanner;

public class Uri1866 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numTeste, x ;

        numTeste = teclado.nextInt();
        
        for (int i = 0; i < numTeste; i++) {
            x = teclado.nextInt();
        
            if (x % 2 == 0)
                System.out.println(0);
            else
                System.out.println(1);
        }
    }
}