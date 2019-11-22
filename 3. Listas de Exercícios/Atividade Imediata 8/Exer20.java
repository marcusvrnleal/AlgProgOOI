/**
Autor: Marcus Vinicius Romero Nobre Leal
Email: marcusvrnleal84@gmail.com
RGA:2017.1906.120-3
Atividade Imediata 8
Ultima Modificação: 05/04/2019
*/

import java.util.Scanner;

public class Exer20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Declaração das variaveis e leitura
        int valor, contador;
        String msg;
        System.out.println(" Digite um número: ");
        valor = teclado.nextInt();

        // teste com o Switch
        switch (valor) {

        // Teste para o valores menor que 5.
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
            msg = "b";
            break;

        // Teste para valores maior que 6 e menor que 12.
        case 7:
        case 8:
        case 9:
        case 10:
        case 11:
            msg = "c";
            break;
        // Teste para valores diferente de 15 e diferente de 17
        case 5:
        case 6:
        case 12:
        case 13:
        case 14:
        case 16:
        case 18:
        case 19:
        case 20:
            msg = "d";
            break;

        case 15:
        case 17:
            msg = "e";
            break;

        default:
            msg = "a";
            break;
        }
        System.out.println(msg);
        teclado.close();
    }
}