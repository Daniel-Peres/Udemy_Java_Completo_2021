package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String path = "C:\\workspaces\\eclipse_workspace\\Udemy_Java_Completo_2021\\secao17_01_Trabalhando_com_arquivos_File_e_Scanner\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) { // o bloco try abre e fecha os recursos automaticamente

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
