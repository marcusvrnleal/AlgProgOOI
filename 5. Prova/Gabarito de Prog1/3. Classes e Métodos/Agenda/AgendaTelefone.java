public class AgendaTelefone{

	Contato[] contatos;

	public AgendaTelefone(){
		this.contatos = new Contato[10];
	}

	public boolean insereContato(String nome, String telefone){
		boolean inseriu = false;

		for(int i = 0; i < contatos.length && !inseriu; i++){
			if(contatos[i] == null){
				contatos[i] = new Contato(nome, telefone);
				inseriu = true;
			}
		}

		return inseriu;

	}

	public Contato removeContato(String nome){
		Contato contatoRemovido = null;

		for(int i = 0; i < contatos.length; i++){
			if(contatos[i] != null && contatos[i].getNome().equals(nome)){
				contatoRemovido = contatos[i];
				contatos[i] = null;
			}
		}

		return contatoRemovido;
	}

	public String consultaTelefone(String nome){
		String telefone = null;

		for( int i = 0; i < contatos.length && telefone == null; i++){
			if(contatos[i] != null && contatos[i].getNome().equals(nome)){
				telefone = contatos[i].getTelefone();
			}
		}

		return telefone;
	}

	private String formataTelefone(String telefone){
		String retorno = "";
		if(telefone != null){
			retorno = "(" + telefone.substring(0,2) + ")";
			retorno += telefone.substring(2,7) + " - " + telefone.substring(7);
		}

		return retorno;

	}

	@Override
	public String toString(){
		String msg = "";
		for(int i = 0; i < contatos.length; i++){
			if(contatos[i] != null){
				msg += contatos[i].getNome() + " - " + formataTelefone(contatos[i].getTelefone());
				msg += "\n";
			}
		}

		return msg;
	}

}