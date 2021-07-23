package secao06_estruturasRepetitivasFor;

import java.util.Scanner;

public class EstruturaRepetitivaFor_ex06 {

	public static void main(String[] args) {

//		Ler um número inteiro N e calcular todos os seus divisores.
//		Exemplo:
//		Entrada:	6	Saída:	1
//								2
//								3
//								6

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			if (N % i == 0)
				System.out.println(i);
		}

		sc.close();

	}

}
