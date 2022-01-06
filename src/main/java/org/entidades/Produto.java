package entidades;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;
	
	public double totalValorEstoque() {
		
		return preco * quantidade;
	}
	
	public void AddProdutos(int entrada) {
		
		quantidade += entrada;
	}
	
	public void RemoverProdutos(int saida) {
		
		quantidade -= saida;
	}
	
	public String toString() {
		return  nome + ", $" + String.format("%.2f", preco) + ", " + quantidade + " unidades, Total: $ "
	+ String.format("%.2f", totalValorEstoque());
		
	}
	

}
