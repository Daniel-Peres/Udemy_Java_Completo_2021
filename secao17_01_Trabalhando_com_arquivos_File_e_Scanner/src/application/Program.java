package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		File file = new File("C:\\eclipse_workspace\\Udemy_Java_Completo_2021\\secao17_01_Trabalhando_com_arquivos_File_e_Scanner\\in.txt");
		Scanner sc = null;

		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}

		}
	}

}
