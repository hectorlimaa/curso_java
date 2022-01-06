import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		double x = 10.35784;
		String nome = "Hector";
		int idade = 27;
		double renda = 2800;

		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		System.out.println("Resultado " + x + "R$");
		System.out.printf("Resultado  %.2f R$ %n", x); // concatenar varias váriaveis tbm usando marcador
		
		System.out.printf("%s tem %d e ganha %.2f de Reais ", nome, idade, renda);
		
		
		
	}

}
