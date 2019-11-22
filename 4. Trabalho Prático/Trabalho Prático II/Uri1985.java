import java.util.Scanner;

public class Uri1985 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int qtdProdutos = teclado.nextInt();
        double total = 0;
        for (int i = 0; i < qtdProdutos; i++) {
            int catalogo = teclado.nextInt();
            int qtd = teclado.nextInt();

            switch (catalogo) {
            case 1001:
                total += (1.5 * qtd);
                break;

            case 1002:
                total += (2.5 * qtd);
                break;

            case 1003:
                total += (3.5 * qtd);
                break;

            case 1004:
                total += (4.5 * qtd);
                break;

            case 1005:
                total += (5.5 * qtd);
                break;

            default:
                break;
            }
        }
        System.out.printf("%.2f\n", total);
        teclado.close();
    }
}