public class EmpregadoTeste{
	public static void main (String [] args){
		System.out.printf("Número de empregados antes: %d\n", Empregado.getCount());
		
		Empregado e1 = new Empregado ("Fulano", "de Tal"),
				  e2 = new Empregado ("Ciclano", "de Tal");
				  
		System.out.println("Empregados depois: ");
		System.out.printf("via e1.getCount(): %d\n", e1.getCount());
		System.out.printf("via e2.getCount(): %d\n", e2.getCount());
		System.out.printf("via Empregado.getCount(): %d\n", Empregado.getCount());
		
		System.out.printf("\nEmpregado 1: %s %s - Empregado2: %s %s\n",
						   e1.getNome(), e1.getSobrenome(),
						   e2.getNome(), e2.getSobrenome());	   
		e1 = null;
		e2 = null;
		
		System.out.println(e1.getCount());
		System.out.printf("via Empregado.getCount(): %d\n", Empregado.getCount());

	}
}
