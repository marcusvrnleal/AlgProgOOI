import java.util.Scanner;

public class Uri1009{
    public static final double TAXA = 15/100; //15% de comissão.

    public static void main (String []args){
        Scanner teclado = new Scanner(System.in);

        String nomeFuncionario;
        double salario, vendas;
		nomeFuncionario = teclado.next(); //nome do funcionario.
		salario = teclado.nextDouble(); //Salario
		vendas = teclado.nextDouble(); //vendas 
		salario += (vendas * TAXA); //Calculo da comissao
		System.out.printf("TOTAL = R$ %.2f\n", salario);

        teclado.close();
    }
}