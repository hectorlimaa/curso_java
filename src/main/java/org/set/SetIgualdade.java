package set;
import java.util.Set;
import java.util.TreeSet;

import entidades.ProductArray;

public class SetIgualdade {

	public static void main(String[] args) {
		Set<ProductArray> set = new TreeSet<>();
		
		set.add(new ProductArray("TV", 900.0));
		set.add(new ProductArray("Notebook", 1200.0));
		set.add(new ProductArray("Tablet", 400.0));
		
		
		
		
		for(ProductArray p : set) {
			System.out.println(p);
			
		}

	}

}
