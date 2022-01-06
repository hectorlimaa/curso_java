import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String res = "";
		int dia = sc.nextInt();

		switch (dia) {

		case 7:
			res = "Sábado";
			break;
		case 6:
			res = "Sexta";
			break;
		case 5:
			res = "Quinta";
			break;
		case 4:
			res = "Quarta";
			break;
		case 3:
			res = "Terça";
			break;
		case 2:
			res = "Segunda";
			break;
		case 1:
			res = "Domingo";
		default: res = "Valor inválido";
			;

		}

		System.out.println("Dia da semana: " + res);

		sc.close();

	}

}
