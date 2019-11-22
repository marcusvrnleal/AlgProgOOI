public class AlunoTeste{
	public static void main(String [] args){
		Aluno a1 = new Aluno("Fulano", "1234"),
		      a2 = new Aluno("Beltrano", "2345");

		System.out.println(a1);
		System.out.println(a2);

		System.out.println(a1.adicionaDisciplina("ALGI"));
		System.out.println(a1.adicionaDisciplina("ALGI"));
		System.out.println(a1.adicionaDisciplina("ALGII"));
		System.out.println(a1.adicionaDisciplina("FTC"));
		System.out.println(a1.adicionaDisciplina("FTC"));
		System.out.println(a1.adicionaDisciplina("ESTDAD"));
		System.out.println(a1.adicionaDisciplina("ADM"));
		System.out.println(a1.adicionaDisciplina("FTI"));
		System.out.println(a1.adicionaDisciplina("ES"));
		System.out.println(a1.adicionaDisciplina("ES"));

		System.out.println("REMOCAO FTC: " + a1.removeDisciplina("FTC"));
		System.out.println("REMOCAO FTC: " + a1.removeDisciplina("FTC"));
		System.out.println("REMOCAO ESTDAD: " + a1.removeDisciplina("ESTDAD"));
		System.out.println("REMOCAO ES: " + a1.removeDisciplina("ES"));

		System.out.println("ADD ES: " + a1.adicionaDisciplina("ES"));
		System.out.println("ADD ES: " + a1.adicionaDisciplina("ES"));
		System.out.println("ADD VVT: " + a1.adicionaDisciplina("VVT"));
		System.out.println("ADD FTC: " + a1.adicionaDisciplina("FTC"));

		System.out.println("REMOCAO ES: " + a1.removeDisciplina("ES"));

		System.out.println(a1);
		System.out.println(a2);

	}
}