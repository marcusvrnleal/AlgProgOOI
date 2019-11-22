import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        double pA, pB, cresA, cresB;
        int numCres, anos;
        numCres = teclado.nextInt();

       
        for(int i = 0; i < numCres; i++){
            pA = teclado.nextDouble();
            pB = teclado.nextDouble();
            cresA = teclado.nextDouble();
            cresB = teclado.nextDouble();
            cresA/=100;
            cresB/=100;
            for(anos = 0; pA <= pB; anos++){
                pA = Math.floor(pA+(pA*cresA));
                pB = Math.floor(pB+(pB*cresB));
                if(anos>100)
                   anos++;
            }
            if(anos>100)
                System.out.println("Mais de 1 seculo.");
            else
                System.out.println(anos + " anos.");
        }
    }
}