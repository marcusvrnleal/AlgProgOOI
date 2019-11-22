/**
Autor: Marcus Vinicius Romero Nobre Leal
Email: marcusvrnleal84@gmail.com
RGA:2017.1906.120-3
Atividade Imediata 13
Ultima Modificação: 19/05/2019
*/

public class Carro
{
 	public String marca, modelo;
 	public int codigo_chassi;
 	public boolean ligado;
 	public double velocidade;

 	public Carro(String marca, String modelo, int codigo_chassi)
 	{
 		this.marca = marca;
 		this.modelo = modelo;
 		this.codigo_chassi = codigo_chassi;
 		this.ligado = false;
 		this.velocidade = 0;

 	}

 	public void acelerar(double nova_velocidade){
 		if(ligado == true){
 			if(nova_velocidade <= velocidade){
 				System.out.println("Informe uma velocidade maior que a atual para acelerar.");
 			}else{
 				if(nova_velocidade > 150){
 					System.out.println("Tudo tem limite né amigão, você ultrapassou o de velocidade!");
 				}else{
 					velocidade = nova_velocidade;
 				}
 			}
 		}else{
 			System.out.println("Não é possível que você quer acelerar um carro sem ligar (-.-)");
 		}
 	}

 	 public void desacelerar(double nova_velocidade){
 		if(ligado == true){
 			if(nova_velocidade >= velocidade){
 				System.out.println("Informe uma velocidade menor que a atual para desacelerar.");
 			}else{
 				if(nova_velocidade <= 0){
 					System.out.println("Você quer dar ré? Ainda não temos esse sistema, desculpa.");
 				}else{
 					velocidade = nova_velocidade;
 				}
 			}
 		}else{
 			System.out.println("Não é possível que você quer desacelerar um carro sem ligar (-.-)");
 		}
 	}

 	public void frear(){
 		if(ligado == true){
 			velocidade = 0;
 		}
 	}


}