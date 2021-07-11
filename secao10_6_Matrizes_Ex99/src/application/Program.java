package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
//		Fazer um programa para ler um número inteiro N e uma matriz de
//		ordem N contendo números inteiros. Em seguida, mostrar a diagonal
//		principal e a quantidade de valores negativos da matriz.
//		
//		Input: 					Output:
//		 3						Main diagonal:
//		 5  -3  10				5 8 -4
//		15   8   2				Negative numbers = 2
//		 7   9  -4

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] matriz = new int[n][n];
		int count = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
				if (matriz[i][j] < 0)
					count++;
			}
		}

		System.out.println("Main diagonal:");

		for (int i = 0; i < n; i++) {
			System.out.print(matriz[i][i] + " ");
		}

		System.out.println("\nNegative numbers = " + count);

		sc.close();
	}
}
