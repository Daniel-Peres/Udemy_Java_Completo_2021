package secao06_estruturasRepetitivasFor;

import java.util.Scanner;

public class EstruturaRepetitivaFor_ex05 {

	public static void main(String[] args) {

//		Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//		Lembrando que, por definição, fatorial de 0 é 1.
//				
//		Exemplos:
//		Entrada:	4	Saída:24
//		Entrada:	1	Saída:1
//		Entrada:	5	Saída:120
//		Entrada:	0	Saída:1

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int fatorial = 1;

		for (int i = 1; i <= N; i++) {

			fatorial *= i;
		}

		System.out.println(fatorial);

		sc.close();

	}

}
