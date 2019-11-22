import java.util.Scanner;
class Uri1017{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
        
        int tempo = teclado.nextInt();
        int velocidade  = teclado.nextInt();
        double consumo =  (velocidade*tempo)/12.0;
        
        System.out.printf("%.3f\n",consumo);
        
        teclado.close();
	}
}
