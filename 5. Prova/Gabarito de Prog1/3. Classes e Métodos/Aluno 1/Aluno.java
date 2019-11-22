public class Aluno{
	public String nome;
	public int rga;
	public String curso;

	public void imprimeResumo(){
		System.out.println("Nome: " + getNome());
		System.out.println("RGA: " + rga);
		System.out.println("Curso: " + curso);
	}

	public String getNome(){
		return nome;
	}

	public String getCurso(){
		return curso;
	}

	public int getRga(){
		return rga;
	}
}