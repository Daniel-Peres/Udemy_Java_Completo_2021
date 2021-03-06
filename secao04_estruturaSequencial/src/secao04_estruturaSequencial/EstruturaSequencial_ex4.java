package secao04_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencial_ex4 {

	public static void main(String[] args) {
		
//		Fazer um programa que leia o n?mero de um funcion?rio, seu n?mero de horas trabalhadas, o valor que recebe por
//		hora e calcula o sal?rio desse funcion?rio. A seguir, mostre o n?mero e o sal?rio do funcion?rio, com duas casas
//		decimais.
//		
//		Exemplos:
//		Entrada: 25, 100, 5.50     Sa?da: NUMBER = 25, SALARY = U$ 550.00
//		Entrada:  1, 200, 20.50     Sa?da: NUMBER =  1, SALARY = U$ 4100.00
//		Entrada:  6, 145, 15.55    Sa?da: NUMBER =  6, SALARY = U$ 2254.75
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int numero, horas;
		double valorHora = 0.0, salario;
		
		numero = sc.nextInt();
		horas = sc.nextInt();
		valorHora = sc.nextDouble();
		salario = horas * valorHora;
		sc.close();
		
		System.out.printf("NUMBER = %d, SALARY = U$ %.2f", numero, salario);
		
		
	}

}
