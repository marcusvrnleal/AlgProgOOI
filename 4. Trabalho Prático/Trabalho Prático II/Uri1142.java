import java.util.Scanner;
public class Uri1142{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt(), j = 1;
        for(int i = 0; i < n; i++){
            System.out.println(j + " " + (j+1) + " " + (j+2) + " PUM");
            j+=4;
        }

    }
}