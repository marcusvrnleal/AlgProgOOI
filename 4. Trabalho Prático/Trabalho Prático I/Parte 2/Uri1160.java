import java.util.Scanner;
public class Uri1160{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt(), cont;
        double popA, popB, cresA, cresB;
        for(int i = 0; i < numero; i++){
            popA = teclado.nextDouble();
            popB = teclado.nextDouble();
            cresA = teclado.nextDouble();
            cresB = teclado.nextDouble();
            cresA/=100;
            cresB/=100;
            for(cont = 0; popA <= popB; cont++){
                popA = Math.floor(popA+(popA*cresA));
                popB = Math.floor(popB+(popB*cresB));
                if(cont>100)
                    break;
            }
            if(cont>100)
                System.out.println("Mais de 1 seculo.");
            else
                System.out.println(cont + " anos.");
        }
    }
}