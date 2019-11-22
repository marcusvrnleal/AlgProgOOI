public class ManipulaCaracteres{
	public static void main (String [] args){
		String frase = "Estudei muito para a prova! Vou tirar 9,9!";
		int cont;
		for(cont = 0; cont < frase.length(); cont++){
			System.out.println("Caractere na posicao " + cont + ": " + frase.charAt(cont));
		}
	}
}