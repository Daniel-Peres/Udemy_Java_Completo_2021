package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
//		Fazer um programa para ler dois números inteiros M e N, e depois ler
//		uma matriz de M linhas por N colunas contendo números inteiros,
//		podendo haver repetições. Em seguida, ler um número inteiro X que
//		pertence à matriz. Para cada ocorrência de X, mostrar os valores à
//		esquerda, acima, à direita e abaixo de X, quando houver, conforme
//		exemplo.		
//		
//		Entrada:				Saída:
//		3 4						Position 0,1:
//		10 8 15 12				Left: 10
//		21 11 23 8				Right: 15
//		14 5 13 19				Down: 11
//		8						Position 1,3:
//								Left: 23
//								Up: 12
//								Down: 19

		Scanner sc = new Scanner(System.in);

		int l = sc.nextInt();
		int c = sc.nextInt();
		int[][] matriz = new int[l][c];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		int n = sc.nextInt();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == n) {
					System.out.println("Position " + i + "," + j + ":");

					if (j > 0) {
						System.out.println("Left: " + matriz[i][j - 1]);
					}

					if (i > 0) {
						System.out.println("Up: " + matriz[i - 1][j]);
					}

					if (j < matriz[i].length - 1) {
						System.out.println("Right: " + matriz[i][j + 1]);
					}

					if (i < matriz.length - 1) {
						System.out.println("Down: " + matriz[i + 1][j]);
					}
				}
			}
			sc.close();
		}
	}
}
