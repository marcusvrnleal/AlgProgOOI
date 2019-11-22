public class OperadoresUnarios{
	public static void main (String [] args){
		int num1, num2, num3;

		num1 = 1;
		num2 = 4;

		num3 = num1++ + num2;

		System.out.printf("Num1: %d - Num2: %d - Num3: %d \n", num1, num2, num3);
	
		num3 = num1 + num2;
		System.out.printf("Num1: %d - Num2: %d - Num3: %d \n", num1, num2, num3);
	}
}