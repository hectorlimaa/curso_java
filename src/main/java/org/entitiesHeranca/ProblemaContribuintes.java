package entitiesHeranca;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProblemaContribuintes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		List<Contribuintes> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers :");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)?");
			char ch = sc.next().charAt(0);

			if (ch == 'i') {
				System.out.print("Name: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Anual income: ");
				double income = sc.nextDouble();
				System.out.print("Health expenditures: ");
				double health = sc.nextDouble();

				Contribuintes individual = new PessoaFisica(nome, income, health);
				list.add(individual);
			} else {
				System.out.print("Name: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Anual income: ");
				double income = sc.nextDouble();
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();

				Contribuintes company = new PessoaJuridica(nome, income, employees);
				list.add(company);
			}
		}

		System.out.println();
		System.out.println("TAXES PAID");

		for (Contribuintes contribuintes : list) {
			System.out.println(contribuintes.getNome() + ": $" + String.format("%.2f", contribuintes.imposto()));
		}
		
		double taxes = 0;
		
		for(Contribuintes contribuintes : list) {
			taxes += contribuintes.imposto();
		}

		System.out.print("TOTAL TAXES: $" + taxes);
		
		sc.close();

	}

}
