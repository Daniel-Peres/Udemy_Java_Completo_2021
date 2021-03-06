package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {

//		Fazer um programa para ler valores da largura e altura de um retangulo. 
//		Em seguida mostrar na tela o valor de sua ?rea, perimetro e diagonal.
//		Usar uma classe como mostrado no projeto ao lado:
//			    
//				 Rectangle
//		----------------------------
//			- Width: double
//			- Height: double
//		----------------------------		
//			+ Area(): double
//			+ Perimeter(): double
//			+ Diagonal(): double
//		----------------------------		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle retangulo = new Rectangle();

		System.out.println("Enter rectangle width and height:");
		retangulo.height = sc.nextDouble();
		retangulo.width = sc.nextDouble();

		System.out.printf("Area: %.2f\n", retangulo.Area());
		System.out.printf("Perimeter: %.2f\n", retangulo.Perimeter());
		System.out.printf("Diagonal: %.2f\n", retangulo.Diagonal());

		sc.close();

	}

}
