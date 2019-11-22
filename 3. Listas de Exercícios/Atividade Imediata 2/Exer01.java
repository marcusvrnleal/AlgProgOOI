import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor digite 4 números, para realizar a soma: ");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();
        int num4 = teclado.nextInt();

        int soma = num1 + num2 + num3 + num4;

        System.out.println("A soma dos números é: ");
        System.out.println(soma);
        teclado.close();
    }
}