package secao05_estruturaCondicional_if_else;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional_ex05 {

	public static void main(String[] args) {
//		Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. 
//		A seguir, calcule e mostre o valor da conta a pagar.
//		
//		TABELA:
//			CODIGO 		ESPECIFICACAO 		PRECO
//			  1			CACHORRO QUENTE		R$ 4.00
//			  2			X-SALADA			R$ 4.50
//	  		  3			X-BACON				R$ 5.00
//			  4			TORRADA SIMPLES		R$ 2.00
//			  5			REFRIGERANTE		R$ 1.50
//		
//		Exemplos:
//		Entrada: 3 2	Saída:Total: R$ 10.00
//		Entrada: 2 3	Saída:Total: R$ 13.50
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		switch (codigo) {
		case 1 : 
			System.out.printf("Total: R$ %.2f\n", (quantidade * 4.00));
			break;
		case 2 :
			System.out.printf("Total: R$ %.2f\n", (quantidade * 4.50));
			break;
		case 3:
			System.out.printf("Total: R$ %.2f\n", (quantidade * 5.00));
			break;
		case 4:
			System.out.printf("Total: R$ %.2f\n", (quantidade * 2.00));
			break;
		case 5:
			System.out.printf("Total: R$ %.2f\n", (quantidade * 1.50));
			break;
		default :
			System.out.println("Item inexistente");
		}		
		sc.close();
	}
}
