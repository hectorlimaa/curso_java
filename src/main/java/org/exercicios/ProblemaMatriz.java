package exercicios;

import java.util.Scanner;

public class ProblemaMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de colunas da matriz: ");
		int m = sc.nextInt();
		System.out.print("Digite a quantidade de linhas da matriz: ");
		int n = sc.nextInt();
		
		int mat[][] = new int [m][n];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.print("Informar número desejado para ver se possui na matriz :");
		int number = sc.nextInt();
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == number) {
					System.out.println("Position: " + i + ", " + j );
					if(j > 0) {
						System.out.println("LEFT: " + mat[i][j - 1]);
						
					}
					if(i > 0) {
						System.out.println("UP: " + mat[i - 1][j]);
					}
					
					if(j < mat[i].length - 1) {
						System.out.println("RIGHT: " + mat[i][j + 1]);
					}
					if(i < mat.length - 1) {
						System.out.println("DOWN: " + mat[i + 1][j]);
						
					}
					
				}
			}
		}
		
		
		
		sc.close();

	}

}
