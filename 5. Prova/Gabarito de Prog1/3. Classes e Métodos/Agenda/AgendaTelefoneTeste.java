public class AgendaTelefoneTeste{
	public static void main (String [] args){
		AgendaTelefone a1 = new AgendaTelefone();

		a1.insereContato("Bruno", "12345678910");
		a1.insereContato("Fulano", "10987654321");
		a1.insereContato("Bruno", "23456789012");

		System.out.println(a1);
	}
}