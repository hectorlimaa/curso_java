package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entidades.FuncionarioList;


public class ProblemaList {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		List<FuncionarioList> funcionarios = new ArrayList<>();

		System.out.print("Quantos funcionários deseja registrar? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Funcionário #" + (1 + i) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();

			while (hasId(funcionarios, id)) {
				System.out.println("Id já está sendo utilizado, informe outro: ");
				id = sc.nextInt();
			}
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			double salario = sc.nextDouble();

			FuncionarioList func = new FuncionarioList(id, nome, salario);
			funcionarios.add(func);

		}

		System.out.println();
		System.out.print("Digite o código do funcionário que deseja fazer o aumento: ");
		int id = sc.nextInt();

		FuncionarioList emp = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (emp == null) {

			System.out.println("Este ID não existe");
		} else {
			System.out.print("Informe o percentual de aumento do sálario :");
			double percentual = sc.nextDouble();
			emp.AumentoSalario(percentual);

		}

		System.out.println();

		for (FuncionarioList funcionario : funcionarios) {
			System.out.println(funcionario);

		}

		sc.close();

	}

	public static boolean hasId(List<FuncionarioList> list, int id) {
		FuncionarioList emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
