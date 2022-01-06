package orientacaoObjeto;

import java.util.Locale;
import java.util.Scanner;

import utilitarios.Calculator;

public class MembrosEstaticos {
	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Entre com o raio: ");
		double raio = sc.nextDouble();
		
		double c = Calculator.circumference(raio);
		
		double v = Calculator.volume(raio);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		
		sc.close();
	}
	

}
