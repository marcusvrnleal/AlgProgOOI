import java.util.Scanner;

public class Uri1173 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int num[] = new int[10];
        num[0] = teclado.nextInt();
        System.out.println("N[0] = " + num[0]);
        for (int i = 0; i <10; i++) {
            num[i] = num[i-1]*2;
            System.out.println("N[" + i + "] = " + num[i]);
        }
    }
}