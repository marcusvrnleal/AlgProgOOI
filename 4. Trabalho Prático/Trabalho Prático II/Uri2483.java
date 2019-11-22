import java.util.Scanner;

public class Uri2483 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int i = teclado.nextInt();
        System.out.printf("Feliz nat");
        for (int x = 0; x < i; x++)
            System.out.printf("a");
        System.out.printf("l!\n");

        teclado.close();
    }
}