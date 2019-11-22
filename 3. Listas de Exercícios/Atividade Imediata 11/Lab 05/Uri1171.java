import java.util.Scanner;

public class Uri1171 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numTeste, num = 0;
        numTeste = teclado.nextInt();
        int[] vetor = new int[numTeste];
       
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = teclado.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == num) {
                vetor[i] += 1;
                
            }
            
            System.out.println(vetor[i] + " aparece " + i +" vez(es)");
        }
    }
}
