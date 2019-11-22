/*

Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
Entrada

O arquivo de entrada contém três valores com um dígito após o ponto decimal.
Saída

O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima, sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.*/

import java.util.Scanner;

public class Uri1012{
	public static final double PI = 3.14159;
	public static void main(String [] args){
		
		Scanner teclado = new Scanner(System.in);

		double a = teclado.nextDouble();
		double b = teclado.nextDouble();
		double c = teclado.nextDouble();
		
		double triaRetangulo = (a*c)/2;
		double circulo = (c*c)*PI;
		double trapezio = ((a+b)/2)*c;
		double quadrado = b*b;
		double retangulo = a*b;

		System.out.printf("TRIANGULO: %.3f\n", triaRetangulo);
		System.out.printf("CIRCULO: %.3f\n", circulo); 
		System.out.printf("TRAPEZIO: %.3f\n", trapezio);
		System.out.printf("QUADRADO: %.3f\n", quadrado);
		System.out.printf("RETANGULO: %.3f\n", retangulo);

	}
}