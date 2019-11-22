public class Prova{
	private LeituraValidada leitorDados;
	private String nomeAluno;
	private int rgaAluno;
	private double notaAluno;

	public Prova(String nomeAluno, int rgaAluno){
		this.rgaAluno = rgaAluno;
		this.nomeAluno = nomeAluno;
		notaAluno = 0.0;
		leitorDados = new LeituraValidada();
	}

	public double getNota(){
		return notaAluno;
	}

	public int getRga(){
		return rgaAluno;
	}

	public String getNome(){
		return nomeAluno;
	}

	public void atribuiNota(){
		String msg = "Por favor, digite a nota do aluno " + nomeAluno + ": ";
		notaAluno = leitorDados.leDoubleIntervalo(msg, 0.0, 10.0);
	}

}