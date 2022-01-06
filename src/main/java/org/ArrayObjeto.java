import java.util.Locale;
import java.util.Scanner;

import entidades.ProductArray;

public class ArrayObjeto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ProductArray [] vect = new ProductArray [n];
		
		for(int i = 0; i < vect.length; i++) {
			
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			vect[i] = new ProductArray(name, price);
		}
		
		
		double soma = 0;
		
		for(int i = 0; i < vect.length; i++ ) {
			soma += vect[i].getPrice();
			
		}
		
		double media = soma / n;
		
		System.out.printf("Preço médio : %.2f%n", media);
		
		
		
		sc.close();

	}

}
