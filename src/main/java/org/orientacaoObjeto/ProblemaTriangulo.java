package orientacaoObjeto;
import java.util.Locale;
import java.util.Scanner;

import entidades.Triangulo;

public class ProblemaTriangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();

		System.out.println("Digite os lados do primeiro triângulo");

		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Digite os lados do segundo triângulo");

		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();

		double areaY = y.area();

		System.out.printf("Aréa do triângulo X: %.4f\n", areaX);
		System.out.printf("Aréa do triângulo Y: %.4f\n", areaY);

		if (areaX > areaY) {
			System.out.println("Maior área é : X");
		} else {
			System.out.println("Maior área é : Y");
		}

		sc.close();
	}

}
