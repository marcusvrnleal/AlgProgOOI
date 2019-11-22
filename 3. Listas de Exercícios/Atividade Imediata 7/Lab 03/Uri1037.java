import java.util.Scanner;
public class Uri1037{
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        double intervalo = teclado.nextDouble();

        if((intervalo >=0) && (intervalo <=25.0000)){
            System.out.println("Intervalo [0,25]");
        }
        else if ((intervalo >=25.00001) && (intervalo <=50.0000000)) {
            System.out.println("Intervalo (25,50]");
            
        }
        else if ((intervalo >= 50.0000001) && (intervalo <=70.0000000)) {
            System.out.println("Intervalo (50,75]");
            
        }
        else if ((intervalo >= 70.0000001) && (intervalo <= 100.0000000)) {
            System.out.println("Intervalo (75,100]");
            
        }
        else{
            System.out.println("Fora de intervalo");
        }
    }
    
}