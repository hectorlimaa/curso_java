package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2 {
	public static void main(String[] args) {
		double n1, n2, n3, a, b, c, d, e;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o primeiro valor: ");
		n1 = sc.nextDouble();
		System.out.println("Digite o segundo valor: ");
		n2 = sc.nextDouble();
		System.out.println("Digite o terceiro valor: ");
		n3 = sc.nextDouble();
		
		
		a = (n1 * n3) / 2;
		b = Math.PI * Math.pow(n3, 2);
		c = ((n1 + n2)* n3) / 2;
		d = Math.pow(n2, 2);
		e = n1 * n2;
		
		
		
	System.out.printf("TRIANGULO : %.3f\nCIRCULO : %.3f\nTRAPEZIO : %.3f\nQUADRADO : %.3f\nRETANGULO : %.3f", a, b, c, d, e);
		
		
			
		
		
		sc.close();
		
		
	}

}
