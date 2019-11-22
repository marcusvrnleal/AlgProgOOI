/**
Autor: Marcus Vinicius Romero Nobre Leal
Email: marcusvrnleal84@gmail.com
RGA:2017.1906.120-3
Atividade Imediata 13
Ultima Modificação: 19/05/2019
*/

public class TurmaAlunos{
	int numAlunos;
	private int numProvas;
	private double [][] nota; // Linhas - alunos; Colunas - Provas
	private int [] rga;
	private String [] nomes;
	private String [] tema_prova;
	
	public TurmaAlunos(int numAlunos, int numProvas){
		this.numAlunos = numAlunos;
		this.numProvas = numProvas;
		nota = new double [numAlunos][numProvas];
		rga = new int [numAlunos];
		nomes = new String[numAlunos];
		tema_prova = new String [numProvas];
	}
	
	public double mediaPorAluno (int aluno){
		double media = 0;
		for(int i = 0; i < nota[aluno].length; i++)
			media += nota[aluno][i];
		media = media / nota[aluno].length;
		return media;
	}
	
	public double mediaPorProva (int prova){
		double media = 0;
		for(int i = 0; i < nota.length; i++)
			media += nota[i][prova];
		media = media / nota.length;
		return media;
	}
	
	public double mediaGeral (){
		double media = 0;
		for(int i = 0; i < nota.length; i++)
			media += mediaPorAluno(i);	
		media = media / nota.length;
		return media;
	}
	
	public int calculaAprovados(){
		int numAprovados = 0;
		double mediaAluno;
		for(int i = 0; i < nota.length; i++){
			mediaAluno = mediaPorAluno(i);
			if(mediaAluno >= 6)
				numAprovados++;
		}
		return numAprovados;
	}
	
	public void imprimeResumo(){
		
		// Média por prova
		for(int i = 0; i < nota[0].length; i++)
			System.out.println("A prova " + i + " tem média " +  mediaPorProva(i));
		
		// Média geral da turma
		System.out.println("A média da turma foi " + mediaGeral());
		
		// Número de alunos aprovados
		System.out.println("Foram aprovados " + calculaAprovados() + " alunos.");

	}

	public void imprimeResumoRGA(){
		for (int i=0; i<this.numAlunos;i++ ) 
			System.out.println("O rga do aluno " + i + " é: " + this.rga[i]);			
	}

		public void imprimeResumoNomes(){
		for (int i=0; i<this.numAlunos;i++ ) 
			System.out.println("O nome do aluno " + i + " é: " + this.nomes[i]);			
	}
	

	public void imprimeResumoTemas(){
		for (int i=0; i<this.numProvas;i++ ) 
			System.out.println("O tema da prova " + i + " é: " + this.tema_prova[i]);				
	}
	
	
	public void setNota(int aluno, int prova, double nota){
		if(nota >= 0 && nota <= 10)
			this.nota[aluno][prova] = nota;
		else
			System.out.println("Valor incorreto!");
	}

	public void setTema(int prova, String tema){
		this.tema_prova[prova] = tema;
	}

	public void setRga(int aluno, int rga){
		this.rga[aluno] = rga;
	}

	public void setNome(int aluno, String nome){
		this.nomes[aluno] = nome;
	}
}