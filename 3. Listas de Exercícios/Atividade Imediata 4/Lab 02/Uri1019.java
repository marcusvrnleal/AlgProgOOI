/*

Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.
Entrada

O arquivo de entrada contém um valor inteiro N.
Saída

Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.
*/

import java.util.Scanner;
public class Uri1019{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int n = teclado.nextInt();

		int horas = n/3600;
		int minutos = (n % 3600) / 60;
		int segundos = (n % 3600) % 60;

		System.out.printf("%d:%d:%d\n",  horas, minutos, segundos); 
	}
}