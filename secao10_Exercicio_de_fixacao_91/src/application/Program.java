package application;

import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Student[] rooms = new Student[10];

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("RENT #%d\n", i + 1);
			String name = sc.nextLine();
			String email = sc.nextLine();
			int room = sc.nextInt();
			rooms[room] = new Student(name, email);
		}
		
		System.out.println("Busy rooms:");
		
		for (int i = 0; i < rooms.length ; i++) {
			if (rooms[i] != null) {
				System.out.println(i + ": " +  rooms[i].getName() + ", " + rooms[i].getEmail());
			}
		}

		sc.close();

	}

}
