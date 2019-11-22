public class Empregado{
	private String nome;
	private String sobrenome;
	private static int count = 0; // número de Empregados criados
	
	public Empregado (String nome, String sobrenome){
		this.nome = nome;
		this.sobrenome = sobrenome;
		
		++count; // incrementa a contagem estática
		System.out.printf("Construtor Empregado: %s %s - contador = %d\n", 
		                   nome, sobrenome, count);
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getSobrenome(){
		return sobrenome;
	}
	
	public static int getCount(){
		return count;
	}
}
