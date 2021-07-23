package secao06_estruturasRepetitivasFor;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepetitivaFor_ex03 {

	public static void main(String[] args) {

//		Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//		de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
//		conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
//		peso 5.
//		
//		Exemplo:
//		Entrada:  	3					Saída:	5.7
//					6.5  4.3   6.2				6.3
//					5.1  4.2   8.1				9.3
//					8.0  9.0  10.0

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		double x1, x2, x3, media;

		for (int i = 0; i < N; i++) {
			x1 = sc.nextDouble();
			x2 = sc.nextDouble();
			x3 = sc.nextDouble();

			media = ((x1 * 2) + (x2 * 3) + (x3 * 5)) / 10.0;

			System.out.printf("%.1f\n", media);
		}

		sc.close();

	}

}
