/**
Autor: Marcus Vinicius Romero Nobre Leal
Email: marcusvrnleal84@gmail.com
RGA:2017.1906.120-3
Atividade Imediata 8
Ultima Modificação: 05/04/2019
*/

import java.util.Scanner;

public class Exer19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // declaração e leitura das variaveis
        System.out.println("Informe o dia: ");
        int dia = teclado.nextInt();
        System.out.println("Informe o mês: ");
        int mes = teclado.nextInt();
        System.out.println("Informe o ano: ");
        int ano = teclado.nextInt();

        // Ano do Bissextos.
        if (ano <= 0) {
            System.out.println("Ano inválido");
        }

        // Verifica se é fevereiro
        if (mes == 2) {
            // Como estamos em fevereiro vamos verificar se é bissexto
            if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
                // Se entrou aqui é porque é bissexto, logo vou verificar se dia é 1 - 29
                if (dia <= 0 || dia > 29) {
                    System.out.println("Dia inválido");
                }
            } else if (dia <= 0 || dia > 28) { // Se entrou aqui é porque NÃO é bissexto, logo vou verificar se dia é 1
                                               // - 28
                System.out.println("Dia inválido");
            }
        } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) { // Verifica se é mes de 31 dias
            if (dia <= 0 || dia > 31) {
                System.out.println("Dia inválido");
            }
        } else if (mes > 0 && mes < 13) { // Verifica se mes é valido, se for logo é de 30 dias
            if (dia <= 0 || dia > 30) {
                System.out.println("Dia inválido");
            }
        } else {
            System.out.println("Mes inválido");
        }
    }
}