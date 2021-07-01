package secao06_estruturasRepetitivasWhile;

import java.util.Scanner;

public class EstruturaRepetitivaWhile_ex03 {

	public static void main(String[] args) {

//		Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva um algoritmo para ler 
//		o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código 
//		inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o código 
//		informado for o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, 
//		conforme exemplo.
//		
//		Exemplo:
//		Entrada: 	8		Saída: 	MUITO OBRIGADO
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
