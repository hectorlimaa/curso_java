package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;

public class ProblemaAluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Digite as informações solicitadas :");
		System.out.print("Nome: ");
		aluno.nome = sc.next();
		System.out.print("Nota 1: ");
		aluno.nota1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		aluno.nota2 = sc.nextDouble();
		System.out.print("Nota 3: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.println(aluno);
		
		
		
		
		sc.close();
	}

}
