/**
Autor: Marcus Vinicius Romero Nobre Leal
Email: marcusvrnleal84@gmail.com
RGA:2017.1906.120-3
Atividade Imediata 9
Ultima Modificação: 11/04/2019
*/

/**
Autor: Marcus Vinicius Romero Nobre Leal
Email: marcusvrnleal84@gmail.com
RGA:2017.1906.120-3
Atividade Imediata 9
Ultima Modificação: 11/04/2019
*/

import java.util.Scanner;

public class Exer21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade, contador;
        double mediaDaAltura, altura;

        contador = 0;
        mediaDaAltura = 0;

        do {

            System.out.println("Por favor informe a sua idade e a sua altura:");
            idade = teclado.nextInt();
            altura = teclado.nextDouble();

            
            if (idade > 50) { //Verificação se a pessoa fou acima de 50
                mediaDaAltura += altura;
                contador++;

            }
        } while (idade > 0); //para sair do programa
        if (contador > 0) {
            mediaDaAltura = mediaDaAltura / contador; //Calculo da media de altura para pessoal acima de 50
            System.out.printf("A media das alturas das pessoas com mais de 50 anos é %.1f.\n", mediaDaAltura);

        } else {
            System.out.printf("não há pessoa com mais de 50 anos ");
        }
    }
}