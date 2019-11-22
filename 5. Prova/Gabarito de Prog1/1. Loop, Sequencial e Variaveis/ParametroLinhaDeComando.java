public class ParametroLinhaDeComando{
	public static void main(String [] args){
		char c;
		for(int i = 0; i < args.length; i++){
			System.out.println(args[i]);
			c = args[i].charAt(0);
			System.out.println(c);
		}
		
	}
}