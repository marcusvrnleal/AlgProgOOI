import java.util.Scanner;

public class Uri2238 {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        int a, b, c, d;
        a = teclado.nextInt(); // div
        b = teclado.nextInt(); // n div
        c = teclado.nextInt(); // mult
        d = teclado.nextInt(); // n mult
        boolean achei = false;

        if (a%b!=0){
            for (int n = a; n < c; n+=a) {
                if ((n % a == 0) && (n % b != 0) && (c% n == 0) && (d % n  != 0)) {
                    System.out.println(n);
                    achei = true;
                    n++;
                }
            }
        }


        if (!achei)
            System.out.println("-1");

    }

}