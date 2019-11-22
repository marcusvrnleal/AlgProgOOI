/**
Autor: Marcus Vinicius Romero Nobre Leal
Email: marcusvrnleal84@gmail.com
RGA:2017.1906.120-3
Atividade Imediata 13
Ultima Modificação: 19/05/2019
*/

import java.util.Scanner;
public class ContaBancariaTeste{
	public static void main (String [] args){
		Scanner teclado = new Scanner(System.in);
		String nome, cpf;
		double limite;
		int opcao=-1;
		
		System.out.println("Digite o nome: ");
		nome = teclado.nextLine();
		
		System.out.println("Digite o cpf: ");
		cpf = teclado.nextLine();
		
		System.out.println("Digite o limite do cheque especial: ");
		limite = teclado.nextDouble();
		
		ContaBancaria conta = new ContaBancaria(nome, cpf, limite);
		System.out.println(conta.resumoConta());
			
		while(opcao !=0){
			conta.menu();
			opcao = teclado.nextInt();

			switch(opcao){
				case 1:
					System.out.println("Informe a quantia a ser depositada:");
					conta.deposito(teclado.nextDouble());
					System.out.println("\n"+conta.resumoConta());
					break;
				case 2:
					System.out.println("Informe a quantia a ser retirada:");
					conta.retirada(teclado.nextDouble());
					System.out.println("\n"+conta.resumoConta());
					 break;
				case 3:
					if(conta.jurosMensais() < 1){
						System.out.println("Os juros são de: " + conta.jurosMensais()*100 + " centavos.");
					}else{
						System.out.println("Os juros são de: " + conta.jurosMensais() + " reais.");
					}
					System.out.println("\n"+conta.resumoConta());
					break;
				case 4:
					System.out.println(conta.resumoConta());
					break;
				case 0:
					System.out.println("Obrigada por utilizar nossos serviços.");
					break;
				default:
					System.out.println("Opçao inválida, tente novamente.");
					break;
			}

		}
	}
}