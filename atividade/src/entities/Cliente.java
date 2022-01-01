package entities;

public class Cliente {
	
	private String nome;
	private int numeroC;
	private double valor;
	
	public Cliente(String nome, int numeroC, double depositoFuncao) {
		this.nome = nome;
		this.numeroC = numeroC;
		deposito(depositoFuncao);
	}
	public Cliente(String nome, int numeroC) {
		this.nome = nome;
		this.numeroC = numeroC;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public int getNumeroC() {
		return numeroC;
	}
	public double getValor() {
		return valor;
	}
	
	public void saques(double valorS) {
		double valorT = valorS + 5; 
		this.valor = this.valor - valorT;
	}
	public void deposito(double valorD) {
		double valorT = valorD; 
		this.valor = this.valor + valorT;
	}
	public String toString() {
		return ("Dados atualizados: Nome: " + nome + " Conta: "+ numeroC + " Saldo: $" + valor);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
