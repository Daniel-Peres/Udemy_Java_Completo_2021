package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> lista = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("\nEmployee #" + i + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			lista.add(new Employee(id, name, salary));
		}

		System.out.print("\nEnter the employee id that will have salary increase: ");
		int id = sc.nextInt();

		Employee result = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (result == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			Double percent = sc.nextDouble();
			result.increaseSalary(percent);
		}

		System.out.println("\nList of employees:");
		for (Employee x : lista) {
			System.out.println(x.toString());
		}

		sc.close();

	}

}
