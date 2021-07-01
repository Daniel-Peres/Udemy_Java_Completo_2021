package secao05_estruturaCondicional_if_else;

import java.util.Scanner;

public class EstruturaCondicional_ex03 {

	public static void main(String[] args) {

//		Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//		Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em
//		ordem crescente ou decrescente.
//		
//		Exemplos:
//		Entrada:  6  24	 Sa�da: Sao Multiplos
//		Entrada:  6  25	 Sa�da: Nao sao Multiplos
//		Entrada: 24   6	 Sa�da: Sao Multiplos

		Scanner sc = new Scanner(System.in);

		int A, B;

		A = sc.nextInt();
		B = sc.nextInt();

		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}

		sc.close();

	}

}
