package entidades;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public String toString(){
		return nome + ", $" + String.format("%.2f", salarioLiquido());
	}
	
	public void aumentoSalario(double taxa) {
		salarioBruto += salarioBruto * taxa / 100;  
	}

}
