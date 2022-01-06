package entidades;

public class EncapsulamentoClass {

	private String name;
	private double price;
	private int quantity;

	public EncapsulamentoClass() {
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public String toString() {
		return "Product name : " + name + ", Price products : " + price + ", quantity: " + quantity; 
	}
	
	

}
