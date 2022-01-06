package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class ProblemaRetangulo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Retangulo x = new Retangulo();

		System.out.println("Digite valor da largura e altura do retangulo :");
		x.altura = sc.nextDouble();
		x.largura = sc.nextDouble();

		System.out.printf("Área : %.2f", x.area());
		System.out.printf("\nPerimêtro : %.2f", x.perimetro());
		System.out.printf("\nDiagonal : %.2f", x.diagonal());
		
		
		
		sc.close();

	}

}
