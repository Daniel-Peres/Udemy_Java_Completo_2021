package secao04_estruturaSequencial;

import java.util.Scanner;

public class EstruturaSequencial_ex3 {

	public static void main(String[] args) {
		
//		Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferen�a do produto
//		de A e B pelo produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D).
//		
//		Exemplos:
//		Entrada: 5,6,7,8  Sa�da: DIFERENCA = -26
//		Entrada: 5,6,-7,8 Sa�da: DIFERENCA = 86
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		sc.close();
		
		System.out.println("DIFEREN�A = " + (a*b-c*d));

	}

}
