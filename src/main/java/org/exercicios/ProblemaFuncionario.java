package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class ProblemaFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double taxa;
		Funcionario func = new Funcionario();
		
		System.out.println("Digite os dados do funcionário: ");
		System.out.print("Nome: ");
		func.nome = sc.next();
		System.out.print("Sálario bruto: ");
		func.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		func.imposto = sc.nextDouble();
		
		System.out.println("Sálario Líquido : " + func);
		
		System.out.println("Qual percentual deseja aumentar o salário? ");
		taxa = sc.nextDouble();
		func.aumentoSalario(taxa);
		
		System.out.println("Sálario atualizado : " + func);
		
		
		
		
		
		sc.close();
	}

}
