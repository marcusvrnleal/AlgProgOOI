import java.util.Scanner;

public class Uri1049{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String palavra1, palavra2, palavra3;

        palavra1 = teclado.next();
        palavra2 = teclado.next();
        palavra3 = teclado.next();

        if ("vertebrado".equals(palavra1)) {
            if ("ave".equals(palavra2)) {
                if ("carnivoro".equals(palavra3)) {
                    System.out.print("aguia\n");
                } else {
                    System.out.print("pomba\n");
                }
            } else {
                if ("onivoro".equals(palavra3)) {
                    System.out.print("homem\n");
                } else {
                    System.out.print("vaca\n");
                }
            }
        } else {
            if ("inseto".equals(palavra2)) {
                if ("hematofago".equals(palavra3)) {
                    System.out.print("pulga\n");
                } else {
                    System.out.print("lagarta\n");
                }
            } else {
                if ("hematofago".equals(palavra3)) {
                    System.out.print("sanguessuga\n");
                } else {
                    System.out.print("minhoca\n");
                }
            }
        }
        teclado.close();
    }
}