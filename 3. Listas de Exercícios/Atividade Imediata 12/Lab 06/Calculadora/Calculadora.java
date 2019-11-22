/**
Autor: Marcus Vinicius Romero Nobre Leal
Email: marcusvrnleal84@gmail.com
RGA:2017.1906.120-3
Atividade Imediata 12
Ultima Modificação: 10/05/2019
*/

public class Calculadora {

    // Método para a somar
    public double soma(double num1, double num2) {
        return num1 + num2;

    }

    // Método para a subtração
    public double subtrai(double num1, double num2) {
        return num1 - num2;
    }

    // Método para a multiplição
    public double multiplica(double num1, double num2) {
        return num1 * num2;
    }

    // Método para a divisão
    public double divide(double num1, double num2) {
        return num1 / num2;
    }

    // Método para a potenciação
    public double potencia(double num, int potencia) {
        double resultado;
        resultado = Math.pow(num, potencia);
        return resultado;
    }

}