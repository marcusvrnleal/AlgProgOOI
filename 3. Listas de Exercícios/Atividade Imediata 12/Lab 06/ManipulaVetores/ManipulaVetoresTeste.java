
/**
Autor: Marcus Vinicius Romero Nobre Leal
Email: marcusvrnleal84@gmail.com
RGA:2017.1906.120-3
Atividade Imediata 12
Ultima Modificação: 10/05/2019
*/

import java.util.Scanner;

public class ManipulaVetoresTeste {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String operacao;
        int soma = 0, tamanhoVetor, valor;
        int vetor1[] = new int[valor];
        int vetor2[] = new int[valor];

        // Peça a operação desejada.
        System.out.println("Informe a sua operação");
        operacao = teclado.nextLine();

        // Solicita o tamanho do Vetor
        System.out.println("Informe o tamanho do Vetor: ");
        tamanhoVetor = teclado.nextInt();

        // Solicita o Primeiro Valor para o Vetor1
        System.out.println("Informe o primeiro valor: ");
        valor = teclado.nextInt();

        // Solicita o Primeiro Valor para o Vetor2
        System.out.println("Agora informe o segundo valor: ");
        valor = teclado.nextInt();

        // Criando um novo objeto ou instanciando da classe ManipulaVetores.
        ManipulaVetores vet1 = new ManipulaVetores();

        // teste das operação.
        switch (operacao) {
        case "soma":
            soma += vet1.somaValores(vetor1[valor], vetor2[valor]);
            System.out.println("A soma dos vetores ficou: " + soma);
            break;

        case "inverte":
            operacao = vet1.inverteVetor(vetor[valor]);
            System.out.println("O vetor invertido é: " + operacao);
            break;

        case "imprime":
        operacao = vet1.imprimeVetor(vetor[valor]);
            System.out.println(vetor[valor]);
            break;

        default:
        System.out.println("Opção Inválida!");
            break;
        }
        teclado.close();
    }
}