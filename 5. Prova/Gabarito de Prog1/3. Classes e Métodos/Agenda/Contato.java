public class Contato{
	private String nome;
	private String telefone;

	public Contato(String nome, String telefone){

		if(nome != null && !nome.equals("") && 
		   telefone != null && validaTelefone(telefone)){
			this.nome = nome;
			this.telefone = telefone;
		}
		else{
			System.out.println("Valores invalidos!");
			System.exit(0);
		}
	}

	private boolean validaTelefone(String telefone){
		boolean ehValido = true;
		if(telefone.length() == 11){
			for(int i = 0; i < telefone.length() && ehValido; i++){
				if(!Character.isDigit(telefone.charAt(i))){
					ehValido = false;
				}
			}
		}
		else
			ehValido = false;

		return ehValido;
	}

	public String getNome(){
		return nome;
	}

	public String getTelefone(){
		return telefone;
	}
}