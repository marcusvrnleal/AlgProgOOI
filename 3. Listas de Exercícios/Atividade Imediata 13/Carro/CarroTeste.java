/**
Autor: Marcus Vinicius Romero Nobre Leal
Email: marcusvrnleal84@gmail.com
RGA:2017.1906.120-3
Atividade Imediata 13
Ultima Modificação: 19/05/2019
*/

public class CarroTeste {
    public static void main(String[] args) {
        Carro carroFernanda = new Carro("hyundai", "hb20", 12312);

        System.out.println("A velocidade agora é: " +  carroFernanda.velocidade);

        carroFernanda.ligado = true;
        carroFernanda.acelerar(150);

        System.out.println("A velocidade agora é: " +  carroFernanda.velocidade);

        carroFernanda.desacelerar(50);

        System.out.println("A velocidade agora é: " +  carroFernanda.velocidade);

        carroFernanda.frear();

        System.out.println("A velocidade agora é: " +  carroFernanda.velocidade);
    }
}