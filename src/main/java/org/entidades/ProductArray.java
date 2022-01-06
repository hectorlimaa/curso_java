package entidades;

import java.util.Objects;

public class ProductArray implements Comparable <ProductArray> {
	
	
	private String name;
	private double price;
	
	public ProductArray(String name, double price) {
		this.name = name;
		this.price = price;
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
	
	public String toString() {
		return "Product [name= " + name + ", price= " + price + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductArray other = (ProductArray) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	@Override
	public int compareTo(ProductArray other) {
		return name.toUpperCase().compareTo(other.getName().toUpperCase());
		
	}

	
	
	

}
