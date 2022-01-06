package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitiesHeranca.Employee;
import entitiesHeranca.OutsourcedEmployee;

public class ProblemaHeranca {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the number of employee: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1) + " data: ");
			System.out.print("Outsourced (y/n)?");
			char resp = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuehr = sc.nextDouble();
			if (resp == 'y') {
				System.out.print("Additional charge: ");
				double additional = sc.nextDouble();
				
				Employee emp = new OutsourcedEmployee(name, hours, valuehr, additional);
				list.add(emp);
			}else {
			
			Employee emp = new Employee(name, hours, valuehr);
			list.add(emp);
			}
		}
		
		System.out.println();
		System.out.println("Payments :");
		
		for(Employee emp : list) {
			
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
			
		}
		
		

		sc.close();
	}

}
