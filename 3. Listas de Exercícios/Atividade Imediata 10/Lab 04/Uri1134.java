import java.util.Scanner;
public class Uri1134{
    public static void main(String[] ags){
        Scanner teclado = new Scanner(System.in);
        int X = 0, alcool = 0, gasolina = 0, disel = 0;
        while (X != 4) {
            X = teclado.nextInt();
            if (X == 1) {
               alcool+=1;
            }
            else if (X == 2) {
                gasolina+=1;
                
            }
            else if (X == 3) {
                disel+=1;
                
            }
            
        }
        System.out.print("MUITO OBRIGADO\n");
        System.out.print("Alcool: " + alcool + "\n");
        System.out.print("Gasolina: " + gasolina + "\n");
        System.out.print("Diesel: " + disel + "\n");
    }
}