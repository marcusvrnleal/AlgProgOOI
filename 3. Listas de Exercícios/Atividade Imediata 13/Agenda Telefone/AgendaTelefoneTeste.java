/**
Autor: Marcus Vinicius Romero Nobre Leal
Email: marcusvrnleal84@gmail.com
RGA:2017.1906.120-3
Atividade Imediata 13
Ultima Modificação: 19/05/2019
*/

import java.util.Scanner;
public class AgendaTelefoneTeste{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int encontrado, opcao=-1, posnome, posnumero;
		String nome, numero;
		AgendaTelefone agenda = new AgendaTelefone();

		while(opcao != 5 ){
  					
    		opcao = agenda.menu();

			switch (opcao) {
				case 1:
					agenda.imprimir();
				break;
				case 2: 
					System.out.println("Favor, informe o nome do novo contato.");
					nome = teclado.nextLine();
					System.out.println("Favor, informe o numero do novo contato.");
					numero = teclado.nextLine();
					agenda.adicionar(nome, numero);
				break;
				case 3:
					System.out.println("Favor, informe o nome do contato que será deletado.");
					nome = teclado.nextLine();
					System.out.println("Favor, informe o numero do contato que será deletado.");
					numero = teclado.nextLine();
					agenda.remover(nome, numero);
				break;
				case 4:
					System.out.println("Favor, informe o nome do contato que gostaria de buscar.");
					nome = teclado.nextLine();
					posnome = agenda.procurarNome(nome);
					if(posnome != -1){
						nome = agenda.getNomePosicao(posnome);
						numero = agenda.getNumeroPosicao(posnome);
						System.out.println("O contato " + nome + " tem o número "+ numero);
					}else{
						System.out.println("Contato não encontrado.");
					}
				break;
				case 5:
					System.out.println("Obrigada por usar nosso sistema, tenha um bom dia.");
				break;
				default:
					System.out.println("Opção inválida, por favor, tente novamente.");
				break;
				
			}

		}
	}
}