package exercicios;

import java.util.Locale;
import java.util.Scanner;

import utilitarios.ConversorDolar;

public class ProblemaDolar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double valorDolar,dolar;
		
		System.out.print("Qual cotação atual do dolar: ");
		valorDolar = sc.nextDouble();
		System.out.print("Quantos dolares deseja adquirir: ");
		dolar = sc.nextDouble();
		System.out.printf("Em reais voce deve pagar: %.2f ", ConversorDolar.converter(dolar, valorDolar));
		
		
		
		sc.close();

	}

}
