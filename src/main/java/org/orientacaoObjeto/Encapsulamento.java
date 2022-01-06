package orientacaoObjeto;

import java.util.Locale;

import java.util.Scanner;

import entidades.EncapsulamentoClass;

public class Encapsulamento {
	
		public static void main(String[] args) {
			Locale.setDefault(Locale.US);

			Scanner sc = new Scanner(System.in);
			
			
			
			System.out.println("Enter product data: ");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			EncapsulamentoClass product = new EncapsulamentoClass();
			
			product.setName(name);
			product.setPrice(price);
			
			System.out.println();
			System.out.println("Product data: " + product.getName());
			System.out.println();
			System.out.println("Updated price: " + product.getPrice());
			System.out.println();
			System.out.println(product);
			
			
			sc.close();

		}

	}

