package secao06_estruturasRepetitivasWhile;

import java.util.Scanner;

public class EstruturaRepetitivaWhile_ex03 {

	public static void main(String[] args) {

//		Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes. Escreva um algoritmo para ler 
//		o tipo de combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina 3.Diesel 4.Fim). Caso o usu�rio informe um c�digo 
//		inv�lido (fora da faixa de 1 a 4) deve ser solicitado um novo c�digo (at� que seja v�lido). O programa ser� encerrado quando o c�digo 
//		informado for o n�mero 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combust�vel, 
//		conforme exemplo.
//		
//		Exemplo:
//		Entrada: 	8		Sa�da: 	MUITO OBRIGADO
//					1				Alcool: 1
//					7				Gasolina: 2
//					2				Diesel: 0
//					2
//					4

		Scanner sc = new Scanner(System.in);

		int alcool = 0, gasolina = 0, diesel = 0, x = 0;

		while (x != 4) {

			x = sc.nextInt();

			switch (x) {
			case 1:
				alcool++;
				break;
			case 2:
				gasolina++;
				break;
			case 3:
				diesel++;
				break;
			}

		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();

	}

}
