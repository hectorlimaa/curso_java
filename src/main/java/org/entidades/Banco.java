package entidades;

public class Banco {

	private String nome;
	private double saldo;
	private int idConta;


	public Banco(String nome, double depositoInicial, int idConta) {
		this.nome = nome;
		deposito(depositoInicial);
		this.idConta = idConta;
	}

	public Banco(String nome, int idConta) {
		this.nome = nome;
		this.idConta = idConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaque(double saque) {

		saldo -= 5.00;
		saldo -=  saque;
	}

	public void deposito(double deposito) {

		saldo += deposito;
	}

	public int getIdConta() {
		return idConta;
	}

	public String toString() {
		return "Account " + idConta + ", Holder: " + nome + ", Balance: $" + String.format("%.2f", saldo);
	}

}
