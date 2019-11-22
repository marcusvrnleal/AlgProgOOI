public class ProvaTeste{
	public static void main (String [] a){
		Prova p1, p2;

		p1 = new Prova("Fulano", 1234);
		p2 = new Prova("Beltrano", 4567);

		p1.atribuiNota();
		p2.atribuiNota();

		
		System.out.println("Nota do aluno " + p1.getNome() + ": " + p1.getNota());
		System.out.println("Nota do aluno " + p2.getNome() + ": " + p2.getNota());

	}
}