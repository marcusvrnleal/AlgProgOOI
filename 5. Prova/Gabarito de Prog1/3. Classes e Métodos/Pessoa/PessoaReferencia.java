public class PessoaReferencia{
	
	private Pessoa beltrano; // 2058
	
	public PessoaReferencia(Pessoa aristarco){ //2058
		this.beltrano = aristarco;
	}
	
	public void modificaNome(String novoNome){
		beltrano.setNome(novoNome);
	}

	public String getNome(){
		return beltrano.getNome();
	}
	
	public void soma (int novoValor){
		++novoValor;
	}
	
	public static void main (String [] args){
		Pessoa fulano = new Pessoa("Bruno", 9, 2, 1985); // 2058
		int valor = 3;

		PessoaReferencia pessRef = new PessoaReferencia(fulano); //2058
		
		System.out.println(fulano.getNome());
		System.out.println(pessRef.getNome());
		
		pessRef.modificaNome("Ciclano"); // É igual a fazer novaPessoa.setNome("Ciclano");
		System.out.println(fulano.getNome());	
		
		pessRef.soma(valor);
		System.out.println(valor);
	}
}