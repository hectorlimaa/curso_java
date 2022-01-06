package exercicios;

import java.util.Scanner;

public class Exercicio_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int alcool = 0, gasolina = 0, diesel = 0;

		System.out.println("Escolha qual combustÍvel deseja: ");
		System.out.println("1- Alcool  -  2- Gasolina   - 3- Diesel   - 4- Sair");
		int opcao = sc.nextInt();

		while (opcao != 4) {
			switch (opcao) {
			
			case 1 : alcool += 1;
			break;
			case 2 : gasolina += 1;
			break;	
			case 3 : diesel += 1;
			break;	
			case 4 :
			break;
			default : System.out.println("Código inválido, digite novamente");
			break;
			
			}
			
			opcao = sc.nextInt();

		}
		
		System.out.println("Muito Obrigado");
		System.out.println("Alcool :" + alcool + "\nGasolina :" + gasolina + "\nDiesel :" + diesel);

		sc.close();

	}

}
