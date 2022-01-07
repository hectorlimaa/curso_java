package org.exercicios;

import java.util.Locale;
import java.util.Scanner;

import entidades.Banco;

public class ProblemaBanco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Banco banco;

		System.out.print("Enter account number: ");
		int idConta = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n) ?");
		char condicao = sc.next().charAt(0);

		if (condicao == 'y') {

			System.out.print("Enter initial deposit value: ");
			double deposito = sc.nextDouble();
			banco = new Banco(nome, deposito, idConta);
			
		} else {

			banco = new Banco(nome, idConta);
			
		}
		System.out.println();
		System.out.print("Account data: \n" + banco);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposito = sc.nextDouble();

		banco.deposito(deposito);
		System.out.print("Update account data: " + banco);
		System.out.println();

		System.out.print("Enter withdraw value: ");
		double saque = sc.nextDouble();
		banco.setSaque(saque);
		System.out.print("Update account data: " + banco);

		sc.close();

	}

}
