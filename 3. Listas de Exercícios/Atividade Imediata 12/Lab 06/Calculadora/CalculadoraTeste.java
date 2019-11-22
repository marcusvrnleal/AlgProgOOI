/**
Autor: Marcus Vinicius Romero Nobre Leal
Email: marcusvrnleal84@gmail.com
RGA:2017.1906.120-3
Atividade Imediata 12
Ultima Modificação: 10/05/2019
*/

import java.util.Scanner;

public class CalculadoraTeste {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Declaração das Variaveis
        String operacao;
        double num1, num2, resultado;

        // Criando um objeto da classe e atribuindo
        Calculadora calc1 = new Calculadora();

        // Interação, do primeiro número com o usuário
        System.out.println("Por favor, informe o primeiro valor:");
        num1 = teclado.nextDouble();

        // Interação, do segundo número com o usuário
        System.out.println("Agora, informe o segundo valor:");
        num2 = teclado.nextDouble();

        teclado.nextLine();

        //Escolher a operação.
        System.out.println("Por favor, a sua operação, (soma, subitração, multiplicação, divisão, ou potencia.)");
        operacao = teclado.nextLine();

        //Teste para as operaçoes escolhidas pelo usuário.
        switch (operacao) {
        case "soma":
            resultado = calc1.soma(num1, num2);
            System.out.println("O resultado é: " + resultado);
            break;

        case "subtracao":
            resultado = calc1.subtrai(num1, num2);
            System.out.println("O resultado é: " + resultado);
            break;

        case "multiplicacao":
            resultado = calc1.multiplica(num1, num2);
            System.out.println("O resultado é: " + resultado);
            break;

        case "divisao":
            resultado = calc1.divide(num1, num2);
            System.out.println("O resultado é: " + resultado);
            break;

        case "potencia":
            resultado = calc1.potencia(num1, (int) num2);
            System.out.println("O resultado é: " + resultado);
            break;
        default:
            System.out.println("Operação Inválida");
            break;
        }
        teclado.close();
    }
}