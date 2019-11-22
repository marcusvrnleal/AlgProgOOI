import java.util.Scanner;
public class Uri1020{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
    
        
		int idade = teclado.nextInt();
		int anos = idade/365;
		int meses = (idade%365)/30;
        int dias = (idade%365)%30;
        
		System.out.println(anos + " ano(s)\n" + meses + " mes(es)\n" + dias + " dia(s)");
	}
}
