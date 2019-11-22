/**
Autor: Marcus Vinicius Romero Nobre Leal
Email: marcusvrnleal84@gmail.com
RGA:2017.1906.120-3
Atividade Imediata 12
Ultima Modificação: 10/05/2019
*/

public class ManipulaVetores{
    
    //Atributos
    public int soma;
    
    //Método para efetuar a soma dos Vetor1 e Vetor2.
	public int somaValores(int vetor1[], int vetor2[]){
		for(int i = 0; i < vetor1.length && i < vetor2.length; ++i){
			soma += vetor1[i] + vetor2[i]; 
		}

		return soma;
	}
    
    //Método para inverter o Vetores
	public String inverteVetor(String vetor[]){
		String vetInv = "";
		for(int i = 0;i < vetor.length; ++i){
			vetInv += ' ' + vetor[(vetor.length - 1) - i];
		}

		return vetInv;
	}

    //Método para poder imprimir o vetor.
	public void imprimeVetor(String vetor[]){
		for(int i = 0; i < vetor.length; ++i){
			System.out.println(vetor[i]);
		}
	}
}