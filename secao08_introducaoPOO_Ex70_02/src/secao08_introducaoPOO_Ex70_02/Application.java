package secao08_introducaoPOO_Ex70_02;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

//		Exercicio 02 do video 70 do curso

		Locale.setDefault(Locale.US);

		Employee funcionario = new Employee();

		Scanner sc = new Scanner(System.in);

		System.out.print("Name: ");
		funcionario.name = sc.nextLine();
		System.out.print("Gross salary: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		funcionario.tax = sc.nextDouble();

		System.out.printf("\nEmployee: %s , $ %.2f\n\n", funcionario.name, funcionario.netSalary());

		System.out.print("Wich percentage to increase salary? ");
		funcionario.increaseSalary(sc.nextDouble());

		System.out.printf("\nUpdated data: %s, $ %.2f\n", funcionario.name, funcionario.netSalary());

		sc.close();

	}

}
