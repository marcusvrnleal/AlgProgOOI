/**
Autor: Marcus Vinicius Romero Nobre Leal
Email: marcusvrnleal84@gmail.com
RGA:2017.1906.120-3
Atividade Imediata 13
Ultima Modificação: 19/05/2019
*/
public class ContaBancaria{
	private String nome;
	private double saldo;
	private String cpf;
	private double limite;
	private static final double TAXA = 0.02;
	
	public ContaBancaria(String nome, String cpf, double limite){
		this.nome = nome;
		this.cpf = cpf;
		this.limite = limite;
		saldo = 0.0;
	}
	
	public void deposito(double valor){
		saldo += valor;
	}
	
	public void retirada(double valor){
		if(valor <= limite+saldo)
			saldo -= valor;
		else
			System.out.println("Caloteiro! Você não pode retirar mais do que possui de limite.");
	}
	
	public double jurosMensais(){
		double juros = 0.0;
		
		if (saldo < 0.0)
			juros = -saldo*TAXA;
		return juros;
	}
	
	public String resumoConta(){
		String resumo = "";
		
		resumo += "Nome: " + nome + "\n" + "Saldo: " + saldo + "\n";
		
		return resumo;
	}
	
	public double getLimite(){
		return limite;
	}
	
	public void setLimite(double novoLimite){
		if(novoLimite > 0)
			limite = novoLimite;
		else
			System.out.println("Não possível atribuir limite negativo, seu burro!");
	}

	public void menu(){
		System.out.println("Informe a operação que deseja realizar:");
		System.out.println("1 - Depósito");
		System.out.println("2 - Retirada");
		System.out.println("3 - Consultar quanto de juros será pago no próximo mês");
		System.out.println("4 - Imprimir resumo da Conta");
		System.out.println("0 - Sair");
	}
}