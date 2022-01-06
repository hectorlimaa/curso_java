package exercicios;

import java.util.Scanner;

public class Exercicio_3 {
	public static void main(String[] args) {
		int a, b, res;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor :");
		a = sc.nextInt();
		System.out.println("Digite o segundo valor :");
		b = sc.nextInt();

		if (a > b) {
			res = a % b;
		} else {
			res = b % a;
		}

		
		if(res == 0) {
			System.out.println("São Multiplos");
		}else {
			
			System.out.println("Não são Multiplos");
		}
		
		
		
		
		sc.close();
	}

}
