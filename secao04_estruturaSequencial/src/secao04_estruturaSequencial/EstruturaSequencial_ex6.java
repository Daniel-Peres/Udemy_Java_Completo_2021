package secao04_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencial_ex6 {

	public static void main(String[] args) {
		
//		Fazer um programa que leia tr?s valores com ponto flutuante de dupla precis?o: A, B e C. Em seguida, calcule e
//		mostre:
//		a) a ?rea do tri?ngulo ret?ngulo que tem A por base e C por altura.
//		b) a ?rea do c?rculo de raio C. (pi = 3.14159)
//		c) a ?rea do trap?zio que tem A e B por bases e C por altura.
//		d) a ?rea do quadrado que tem lado B.
//		e) a ?rea do ret?ngulo que tem lados A e B.
//
//		Exemplos:
//		Entrada: 3.0 4.0 5.2  		Sa?da: TRIANGULO: 7.800
//										   CIRCULO: 84.949
//									       TRAPEZIO: 18.200
//									       QUADRADO: 16.000
//									       RETANGULO: 12.000
//									       
//		Entrada: 12.7 10.4 15.2 	Sa?da: TRIANGULO: 96.520										
//		 								   CIRCULO: 725.833
//		 								   TRAPEZIO: 175.560
//		 								   QUADRADO: 108.160
//		 								   RETANGULO: 132.080
		
		Locale.setDefault(Locale.US);
		double a, b, c, pi = 3.14159;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();		
		sc.close();
		
		System.out.printf("TRIANGULO: %.3f\n", (a*c)/2);
		System.out.printf("CIRCULO: %.3f\n", pi*(c*c));
		System.out.printf("TRAPEZIO: %.3f\n", ((a+b)*c)/2.0);
		System.out.printf("QUADRADO: %.3f\n", b*b);
		System.out.printf("RETANGULO: %.3f\n", a*b);
		
		

	}

}
