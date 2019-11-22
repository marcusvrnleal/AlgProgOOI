import java.util.Scanner;  //Torna o programa apto a interagir com o usuário
public class Uri1035{
    public static void main(String []args){

            Scanner teclado = new Scanner(System.in);
            int A = teclado.nextInt();
            int B = teclado.nextInt();
            int C = teclado.nextInt();
            int D = teclado.nextInt();
    
            if (B > C && D > A && ((C + D) > (A + B)) && C > 0 && A > 0 && (A % 2 == 0)) {
                System.out.println("Valores aceitos");
            } else {
                System.out.println("Valores nao aceitos");
            }
    
        }
    }