/**
Autor: Marcus Vinicius Romero Nobre Leal
Email: marcusvrnleal84@gmail.com
RGA:2017.1906.120-3
Atividade Imediata 13
Ultima Modificação: 19/05/2019
*/

import java.util.Scanner;
public class AgendaTelefone{
	private String [] nomes;
	private String [] numeros;
	private int numContatos;

	public AgendaTelefone(){
		this.nomes = new String[50];
		this.numeros = new String [50];
		this.numContatos = 0;
	}



	//Ao adicionar um nome, o método pressupõe que o usuário não está adicionando elementos repetidos
	//Caso isso ocorra, o método remover, irá remover o primeiro elemento repetido e manterá o segundo.
	public void adicionar(String nome, String numero){
		if(numContatos == 50){
			System.out.println("Agenda cheia!");
		}else{
			if(numero.length() > 11){
				System.out.println("Número com mais de 11 digitos! Adição não concluída, tente novamente.");
			}else{
				this.nomes[numContatos] = nome;
				this.numeros[numContatos]=numero;
				this.numContatos++;
				System.out.println("Contato " + this.nomes[numContatos-1] + " adicionado com sucesso!");
			}			
		}
	}
	//Retorna a posicao do item procurado pelo nome ou -1 caso não encontre;
	public int procurarNome(String nome){
		int posicao=-1, i=0;
		while(i<numContatos){
			if (nome.equals(this.nomes[i])) {
				posicao = i;
				i = numContatos;
			}
			i++;
		}
		return posicao;
	}

		//Retorna a posicao do item procurado pelo numero ou -1 caso não encontre;
	public int procurarNumero(String numero){
		int posicao=-1, i=0;
		while(i<numContatos){
			if (numero.equals(this.numeros[i])) {
				posicao = i;
				i = numContatos;
			}
			i++;
		}
		return posicao;
	}

	public void remover(String nome, String numero){
		int posicaoNome, posicaoNumero;
		if (numContatos > 0) {
			posicaoNome = procurarNome(nome);
			if(posicaoNome != -1){
				if (this.numeros[posicaoNome].equals(numero)) {
					if(numContatos == 1){
						numContatos--;
						this.nomes[numContatos] = null;
						this.numeros[numContatos] = null;
					}else{
						System.out.println("Removendo o contato: " + this.nomes[posicaoNome] + " número: " + this.numeros[posicaoNome]);
						for (int i = posicaoNome;i<numContatos-1 ;i++ ) {
							this.nomes[i] = this.nomes[i+1];
							this.numeros[i] = this.numeros[i+1];
						}
						numContatos--;
						this.nomes[numContatos] = null;
						this.numeros[numContatos] = null;
					}
				}else{
					System.out.println("Numero informado incorretamente.");
				}
			}else{
				System.out.println("Contato não encontrado para ser removido!");
			}
		}else{
			System.out.println("Não há contatos na agenda!");
		}
	}


	public String getNomePosicao(int posicao){
		return this.nomes[posicao];
	}

	public String getNumeroPosicao(int posicao){
		return this.numeros[posicao];
	}


	public void imprimir(){
		if(numContatos == 0){
			System.out.println("Não há contato da agenda para ser impresso!");
		}else{
			for (int i =0 ;i<numContatos ;i++ ) {
				System.out.println("Contato: " + this.nomes[i] + " | telefone: " + this.numeros[i]);
			}			
		}
	}

	public int menu(){
		Scanner teclado = new Scanner(System.in);

		System.out.println("Favor, informe a opção desejada \n"+
							"1 - Imprimir a agenda \n"+ 
							"2 - Adicionar contato \n"+
							"3 - Remover contato \n"+
							"4 - Procurar contato \n"+
							"5 - Sair.");
		return (teclado.nextInt());
		
	}
}