import java.util.Scanner;
public class Uri2311{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int quant, gdquant=7, count1, count2, gdmaior, gdmenor;
        String nome;
        double dificuldade, ponto=0, pontomaior, pontomenor, soma;

        quant = teclado.nextInt();

        while(quant<0 || quant>100){
            quant = teclado.nextInt();
        }

        for(count1= 0; count1<quant; count1++){
            nome = teclado.next();
            dificuldade = teclado.nextDouble();
            while(dificuldade<1.2 || dificuldade>3.8){
                dificuldade = teclado.nextDouble();
            }

            pontomenor=0;
            pontomaior=0;
            soma=0;

            for(count2=1; count2<=gdquant; count2++){
                ponto = teclado.nextDouble();

                if(count2==1)
                    pontomenor = ponto;

                if(pontomaior<ponto){
                    pontomaior = ponto;
                }

                if(pontomenor>ponto){
                    pontomenor = ponto;
                }
                soma += ponto;
            }
            soma -= pontomaior;
            soma -= pontomenor;
            soma *= dificuldade;
            System.out.printf("%s %.2f\n", nome, soma);
        }
    }
}