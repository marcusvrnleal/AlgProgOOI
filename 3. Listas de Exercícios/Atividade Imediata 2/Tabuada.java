import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um numero para sua tabuada: ");
        int n = teclado.nextInt();
        for (int x = 0; x <= 10; x++) {
            System.out.println(n + " * " + x  + " = " + n*x);
        
        }
        
    }
}