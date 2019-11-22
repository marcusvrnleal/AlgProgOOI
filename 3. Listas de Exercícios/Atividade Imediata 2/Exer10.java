    /*10. No mundo dos investimentos, um fenômeno bastante interessante é o dos “juros sobre juros”,
em que o rendimento de uma determinada aplicação é cumulativo. Escreva um programa
que receba um valor aplicado, a taxa de juros vigente e mostre o valor do rendimento e o
valor total após dois meses de aplicações.*/

import java.util.Scanner;
public class Exer10{
 public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o valor da sua aplicação: ");
        double val = teclado.nextDouble();
       
        System.out.println("Agora informe a taxa de juros: (exemplo 10% = 0,1)");
        double taxa = teclado.nextDouble();
        
        double valApos1mes = val + val*taxa;
        double valApos2mes = valApos1mes + valApos1mes * taxa;
        System.out.println("A aplicação de "+val+" após 2 meses de juros é "+valApos2mes+" e rendeu "+(valApos2mes-val));
    
        teclado.close();
	}
}