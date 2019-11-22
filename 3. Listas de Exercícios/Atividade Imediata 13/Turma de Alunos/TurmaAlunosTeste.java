/**
Autor: Marcus Vinicius Romero Nobre Leal
Email: marcusvrnleal84@gmail.com
RGA:2017.1906.120-3
Atividade Imediata 13
Ultima Modificação: 19/05/2019
*/
public class TurmaAlunosTeste{
	public static void main(String[] args) {
		TurmaAlunos turma = new TurmaAlunos(30,4);


		for (int i=0;i<15 ;i++ ) {
			for (int j=0;j<4;j++ ) {
				turma.setNota(i, j, 10);
			}	
		}

		for (int i=15;i<30 ;i++ ) {
			for (int j=0;j<4;j++ ) {
				turma.setNota(i, j, 5);
			}	
		}

		turma.imprimeResumo();

		for (int i=0;i<30 ;i++ ) {
			for (int j=0;j<2;j++ ) {
				turma.setNota(i, j, 5);
			}	
		}

		for (int i=0;i<30 ;i++ ) {
			for (int j=2;j<4;j++ ) {
				turma.setNota(i, j, 7);
			}	
		}

		turma.imprimeResumo();


	}
}
