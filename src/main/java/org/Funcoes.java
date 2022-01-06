
public class Funcoes {
	public static void main(String[] args) {

		int n1 = 5, n2 = 8, n3 = 3;

		System.out.println(maior(n1, n2, n3));

	}

	public static int maior(int valor1, int valor2, int valor3) {

		int result;
		if (valor1 > valor2 && valor1 > valor3) {

			result = valor1;

		} else if (valor2 > valor1 && valor2 > valor3) {

			result = valor2;
		} else {
			result = valor3;
		}

		return result;
	}

}
