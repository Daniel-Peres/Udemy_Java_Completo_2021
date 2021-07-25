package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> empregados = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char outsoursed = sc.next().charAt(0);
			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();

			if (outsoursed == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				Employee employee = new OutsourceEmployee(name, hours, valuePerHour, additionalCharge);
				empregados.add(employee);

			} else {
				Employee employee = new Employee(name, hours, valuePerHour);
				empregados.add(employee);
			}

		}

		System.out.println();
		System.out.println("PAYMENTS:");

		for (Employee e : empregados) {
			System.out.println(e);
		}

		sc.close();

	}

}
