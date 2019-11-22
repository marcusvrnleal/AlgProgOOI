import java.util.Arrays;
public class Aluno{
	private String[] disciplinas;
	private String nome;
	private String rga;

	public Aluno(String nome, String rga){
		if(nome != null && !nome.equals("") && 
	       rga != null && !rga.equals("")){
			this.nome = nome;
			this.rga  = rga;
			this.disciplinas = new String[5];
		}
		else{
			System.out.println("Parâmetros incorretos!");
			System.exit(0);
		}
	}

	public String getNome(){
		return nome;
	}

	public String getRga(){
		return rga;
	}

	public String[] getDisciplinas(){
		return disciplinas;
	}

	public boolean adicionaDisciplina(String disciplina){
		
		int posicao = -1;

		if(disciplina == null || disciplina.equals("")){
			System.out.println("Disciplina invalida!");
			return false;
		}

		for(int contador = 0; contador < disciplinas.length; contador++){
			if(disciplinas[contador] != null){ 
				if(disciplinas[contador].equals(disciplina)) 
					return false;			
			}
			else if(posicao == -1){
				posicao = contador;
			}
		}
		
		if(posicao != -1){
			disciplinas[posicao] = disciplina;
			return true;
		}
		else
			return false;	
	}

	public boolean removeDisciplina(String disciplina) {
		boolean remove = false;
		if( disciplina == null || disciplina.equals("") ) {
			System.out.println("Dados de entrada inválidos!");
			return remove;
		}
		for(int i = 0; i < this.disciplinas.length && remove == false; i++) {
			if(this.disciplinas[i]!=null && this.disciplinas[i].equals(disciplina)) {
				this.disciplinas[i] = null;
				remove = true;
			}
		}
		return remove;
	}

	@Override
	public String toString() {
		return "Aluno [disciplinas=" + Arrays.toString(disciplinas) + ", nome=" + nome + ", rga=" + rga + "]";
	}
}