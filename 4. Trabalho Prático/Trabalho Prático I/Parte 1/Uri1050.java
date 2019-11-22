import java.util.Scanner;

public class Uri1050 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int DDD = teclado.nextInt();

        switch (DDD) {
        case 61:
            System.out.print("Brasilia");
            break;

        case 71:
            System.out.print("Salvador");
            break;

        case 11:
            System.out.print("Sao Paulo");
            break;

        case 21:
            System.out.print("Rio de Janeiro");
            break;

        case 32:
            System.out.print("Juiz de Fora");
            break;

        case 19:
            System.out.println("Campinas");
            break;

        case 27:
            System.out.println("Vitoria");
            break;

        case 31:
            System.out.println("Belo Horizonte");
            break;

        default:
            System.out.printf("DDD nao cadastrado");
            break;
        }
        teclado.close();
    }
}