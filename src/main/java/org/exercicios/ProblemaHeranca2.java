package exercicios;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitiesHeranca.ImportedProduct;
import entitiesHeranca.Product;
import entitiesHeranca.UsedProduct;

public class ProblemaHeranca2 {

	public static void main(String[] args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number od products: ");
		int number = sc.nextInt();

		for (int i = 0; i < number; i++) {
			System.out.print("Product #" + (i + 1) + " data");
			System.out.print("Common, used or imported (c/u/i)?");
			char resp = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			if (resp == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");

				SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
				sc.nextLine();
				String data = sc.nextLine();
				Date manufactureDate = formato.parse(data);

				Product prod = new UsedProduct(name, price, manufactureDate);
				list.add(prod);
			} else if (resp == 'i') {
				System.out.println("Customs fee: $");
				double customs = sc.nextDouble();
				
				Product prod = new ImportedProduct(name, price, customs);
				list.add(prod);

			} else {
				
				Product prod = new Product(name, price);
				list.add(prod);
			}

		}
		
		System.out.println();
		for(Product prod : list) {
			System.out.println(prod.priceTag());
		}

		
		sc.close();
	}

}
