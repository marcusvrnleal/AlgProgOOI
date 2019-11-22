import java.util.Scanner;

public class Uri1019 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int tempo = teclado.nextInt();
        int horas = tempo / 3600;
        int minutos = (tempo % 3600) / 60;
        int segundos = tempo % 60;
        System.out.println(horas + ":" + minutos + ":" + segundos);

        teclado.close();
    }
}
