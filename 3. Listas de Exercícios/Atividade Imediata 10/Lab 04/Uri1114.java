import java.util.Scanner;
public class Uri1114{
  public static void main(String []args){
      Scanner teclado = new Scanner(System.in);

      int senha = teclado.nextInt();

      while (senha != 2002) {
          System.out.print("Senha Invalida\n");
          senha = teclado.nextInt();
          
      }
      System.out.print("Acesso Permitido\n");
  }  

}