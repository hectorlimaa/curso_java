package exercicios;

import java.util.Scanner;

import entidades.Pensao;

public class ProblemaPensao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pensao [] quartos = new Pensao [9];
		
		System.out.print("Quantos estudantes irão precisar de quartos? ");
		int n = sc.nextInt();
		
		
		
		for(int i = 0; i < n ; i++) {
			
			int quarto = i + 1;
			System.out.println("Locação #" + quarto);
			System.out.print("Nome : ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email :");
			String email = sc.nextLine();
			System.out.print("Quarto desejado :");
			int escolha = sc.nextInt();
			
			quartos[escolha] = new Pensao(nome, email, escolha);			
			
		}
		
		System.out.println();
		System.out.println("Quartos ocupados :");
		for(int i = 0; i < quartos.length; i++) {
			if(quartos[i] != null) {
				System.out.println(quartos[i].getQuarto() + ": " + quartos[i].getNome() + ", " + quartos[i].getQuarto());
			}
			
		}
		
		sc.close();
	}

}
