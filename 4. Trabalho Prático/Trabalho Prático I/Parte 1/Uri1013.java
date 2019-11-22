import java.util.Scanner;
class Uri1013{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
	
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = teclado.nextInt();
        
        double maiorAB = (a + b + (Math.abs(a - b)))/2;
		double maiorABC = (maiorAB + c + (Math.abs(maiorAB - c)))/2;
        
        if(maiorABC == a)
			System.out.println(a + " eh o maior");
		else if(maiorABC == b)
			System.out.println(b + " eh o maior");
		else if(maiorABC == c)
        System.out.println(c + " eh o maior");

        teclado.close();
    }
    
}
