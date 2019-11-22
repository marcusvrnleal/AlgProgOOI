/**
Autor: Marcus Vinicius Romero Nobre Leal
Email: marcusvrnleal84@gmail.com
RGA:2017.1906.120-3
Atividade Imediata 13
Ultima Modificação: 19/05/2019
*/

public class TurmaAlunosTeste{
	public static void main(String[] args) {
		String tema;
		int rga;
		String nome;
		TurmaAlunos turma = new TurmaAlunos(30,4);

		//Preechimento dos temas da prova
		for (int i=0;i<4 ;i++ ) {
			tema = "tema "+i;
			turma.setTema(i, tema);
		} 

		//Preenchimento dos rgas dos alunos
		for (int i=0;i<30 ;i++ ) {
			rga = i;
			turma.setRga(i, rga);			
		}

		for (int i=0;i<30 ;i++ ) {
			nome = "teste"+i;
			turma.setNome(i, nome);			
		}

		//Preenchimento da nota dos 15 primeiros alunos em todas as provas
		for (int i=0;i<15 ;i++ ) {
			for (int j=0;j<4;j++ ) {
				turma.setNota(i, j, 10);
			}	
		}
		//Preenchumento da nota dos 15 últimos alunos em todas as provas
		for (int i=15;i<30 ;i++ ) {
			for (int j=0;j<4;j++ ) {
				turma.setNota(i, j, 5);
			}	
		}
		//Impressão
		turma.imprimeResumo();

		//Preenchimento da nota de todos os alunos das 2 primeiras provas
		for (int i=0;i<30 ;i++ ) {
			for (int j=0;j<2;j++ ) {
				turma.setNota(i, j, 5);
			}	
		}
		//Preenchimento da nota de todos os alunos das 2 últimas provas
		for (int i=0;i<30 ;i++ ) {
			for (int j=2;j<4;j++ ) {
				turma.setNota(i, j, 7);
			}	
		}
		//Impressão
		turma.imprimeResumo();	
		turma.imprimeResumoRGA();
		turma.imprimeResumoNomes();
		turma.imprimeResumoTemas();
	}
}
