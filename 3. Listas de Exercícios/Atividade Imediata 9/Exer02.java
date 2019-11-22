/**
Autor: Marcus Vinicius Romero Nobre Leal
Email: marcusvrnleal84@gmail.com
RGA:2017.1906.120-3
Atividade Imediata 9
Ultima Modificação: 11/04/2019
*/

import java.util.Scanner;
public class Exer02 {

    public static void main(String[] args){
    
        Scanner teclado = new Scanner(System.in);
        int numeroFinal = teclado.nextInt();
        double somaFatorial = 1;
        long fatorialAtual = 11;
        
        for (int i = 1; i <= numeroFinal; i++) { //fatorAtual = 1

            fatorialAtual = i * fatorialAtual;
            somaFatorial += 1.0 / fatorialAtual; 
            
        }
        System.out.printf("Valor final: %.50f\n", somaFatorial);

     teclado.close();   
    }
}