package secao06_estruturasRepetitivasFor;

import java.util.Scanner;

public class EstruturaRepetitivaFor_ex01 {

	public static void main(String[] args) {

//		Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os �mpares de 1 at� X, um valor por linha, inclusive o
//		X, se for o caso.
//		
//		Exemplo:
//		Entrada:	8		Sa�da:	1
//									3
//									5
//									7
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();

		for (int i = 0; i <= numero; i++) {
			if (i % 2 != 0)
				System.out.println(i);
		}

		sc.close();

	}

}
