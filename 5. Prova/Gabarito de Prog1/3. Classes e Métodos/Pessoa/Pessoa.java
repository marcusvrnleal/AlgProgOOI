public class Pessoa
{
	private String nome;
	private int diaNasc, mesNasc, anoNasc;
	
	public Pessoa(String nome, int diaNasc, int mesNasc, int anoNasc){
		this.nome = nome;
		this.diaNasc = diaNasc;
		this.mesNasc = mesNasc;
		this.anoNasc = anoNasc;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public int getDiaNasc(){
		return this.diaNasc;
	}
		
	public int getMesNasc(){
		return this.mesNasc;
	}
	
	public int getAnoNasc(){
		return this.anoNasc;
	}
	
	public boolean equals(Pessoa pessoa2){
		if(nome.equals(pessoa2.nome) && 
		   diaNasc == pessoa2.diaNasc &&
		   mesNasc == pessoa2.mesNasc &&
		   anoNasc == pessoa2.anoNasc)
		   return true;
		else
			return false;
	}
	
	public static void main(String [] args){
		Pessoa joao  = new Pessoa("Bruno", 9, 2, 1985), //248
			   maria = new Pessoa("Bruno", 9, 2, 1985); // 539
			   
		if(joao == maria)
			System.out.println("Sao iguais com ==");
		
		if(joao.equals(maria))
			System.out.println("Sao iguais com equals");
			
		joao = maria;	
			
		if(maria == joao)
			System.out.println("Sao iguais com == no segundo teste");
		
		if(joao.equals(maria))
			System.out.println("Sao iguais com equals no segundo teste");	

		System.out.println(joao.getNome());
		System.out.println(maria.getNome());

		maria = null;
		joao = null;

		System.out.println("DEPOIS DO NULL: " + joao);
		System.out.println("DEPOIS DO NULL: " + maria);

		maria = new Pessoa("Bruno", 9,2,1985);
		System.out.println("DEPOIS DO NULL: " + joao);
		System.out.println("DEPOIS DO NULL: " + maria);

	}
	
}
