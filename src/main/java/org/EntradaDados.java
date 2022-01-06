import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String w, s1, s2, s3;
		int x;
		double y;
		char z;

		System.out.println("Digite uma string :");
		w = sc.next();
		System.out.println("Digite uma variável int:");
		x = sc.nextInt();
		System.out.println("Digite uma variável double:");
		y = sc.nextDouble();
		System.out.println("Digite uma variável String:");
		z = sc.next().charAt(0); // Pegar primeiro caracter de uma string
		
		System.out.println("Digite próximos 3 dados \n");
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("Você digitou: " + w + " " + x + " " + y + " " + z);
		System.out.println("Dados Digitados: \n" + s1 + "\n" + s2 + "\n" + s3);

		sc.close();
	}

}
