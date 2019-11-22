/**
Autor: Marcus Vinicius Romero Nobre Leal
Email: marcusvrnleal84@gmail.com
RGA:2017.1906.120-3
Atividade Imediata 8
Ultima Modificação: 05/04/2019
*/

import java.util.Scanner;

public class Exer22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // declaração da variavel
        int numero;

        // Entrada de dados
        System.out.println("Informe um número");
        numero = teclado.nextInt();

        int decimo = numero / 10; //para calcular a dezena.
        int unidade = numero % 10; //calcula a unidade.
        int resultado = unidade +  decimo; //calcula o resultado da dezena com a unidade
        // Teste de verificação dos números se é divisivel por 3.
        if (resultado % 3 == 0) {
            System.out.println(numero + " é divisível por 3, pois "  + decimo + " + " + unidade + " = "+ resultado + ", que é divisível por 3."); //se for exibe é divisível por 3. 

        } else {
            System.out.println(numero + " não é divisível por 3!"); //Senão exibe não é divisivel por 3
        }
        teclado.close();//fechamento do teclado
    }

}