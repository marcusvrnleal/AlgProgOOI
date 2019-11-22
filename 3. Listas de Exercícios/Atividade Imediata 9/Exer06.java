/**
Autor: Marcus Vinicius Romero Nobre Leal
Email: marcusvrnleal84@gmail.com
RGA:2017.1906.120-3
Atividade Imediata 9
Ultima Modificação: 11/04/2019
*/

import java.util.Scanner;
public class Exer06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palavra;
        //Coleta de dados do usuario.
        System.out.println("Informe uma palavra");
        palavra = teclado.nextLine();// Leitura de usuario
         String palavraInvertida = "";
        //Procedimento para palavra Invertida
        for (int i = palavra.length()-1; i >= 0; i--) {
           palavraInvertida += palavra.charAt(i); 
            }
           
            System.out.println(palavraInvertida);//Exibe palavra Invertida
           
            teclado.close();//Fechamento do teclado
    }
}