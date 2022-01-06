import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		int [][] mat = new int [n][n];
		
		for(int i = 0; i < mat.length ; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
			
		}
		
		System.out.print("Main diagonal :");
		
		for(int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println(); 
		System.out.print("Negative numbers: ");
		int contador = 0;
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] < 0) {
					contador += 1;
				}
				
			}
		}
		
		System.out.print(contador);
		

		
		sc.close();
	}

}
