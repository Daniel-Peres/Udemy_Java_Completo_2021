package secao04_estruturaSequencial;

import java.util.Scanner;

public class EstruturaSequencial_ex3 {

	public static void main(String[] args) {
		
//		Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//		de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
//		
//		Exemplos:
//		Entrada: 5,6,7,8  Saída: DIFERENCA = -26
//		Entrada: 5,6,-7,8 Saída: DIFERENCA = 86
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		sc.close();
		
		System.out.println("DIFERENÇA = " + (a*b-c*d));

	}

}
