import java.util.Scanner;

public class While {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		int num1 = sc.nextInt();
		
			while(num1 != 0) {
				soma += num1;
				num1 = sc.nextInt();
				
			}
		
			System.out.println("Saida: " + soma);
		
		
		
		
		
		
		sc.close();
		
	}

}
