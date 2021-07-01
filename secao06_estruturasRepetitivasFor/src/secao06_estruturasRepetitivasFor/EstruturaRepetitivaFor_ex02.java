package secao06_estruturasRepetitivasFor;

import java.util.Scanner;

public class EstruturaRepetitivaFor_ex02 {

	public static void main(String[] args) {

//		Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X que ser�o lidos em seguida.
//		Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos est�o fora do intervalo, mostrando
//		essas informa��es conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
//		
//		Exemplo:
//		Entrada:   5		Sa�da:	2 in
//				  14				3 out
//				 123
//				  10
//				 -25
//				  32

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int X, in = 0, out = 0;

		for (int i = 0; i < N; i++) {
			X = sc.nextInt();
			if (X > 9 && X < 21) {
				in++;
			} else {
				out++;
			}
		}

		System.out.println(in + " in");
		System.out.println(out + " out");

		sc.close();

	}

}
