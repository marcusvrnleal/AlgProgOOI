/**
Autor: Marcus Vinicius Romero Nobre Leal
Email: marcusvrnleal84@gmail.com
RGA:2017.1906.120-3
Atividade Imediata 9
Ultima Modificação: 11/04/2019
*/

import java.util.Scanner;
public class Exer03 {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int nLinhas, nColunas;

        System.out.println("Por favor, digite o numero de linhas e colunas do retangulo");
        nLinhas =  teclado.nextInt();
        nColunas =  teclado.nextInt();

      for (int linhas = 0; linhas < nLinhas; linhas++) {//percorre os numeros de linhas
          for (int colunas = 0; colunas < nColunas; colunas++) {//percorre os numeros de colunas
              System.out.print("*");
              
          }
          System.out.println();
      }
      teclado.close();//fechamento do teclado.
    }
}