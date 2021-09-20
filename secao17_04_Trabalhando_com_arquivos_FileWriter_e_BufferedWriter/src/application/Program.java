package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };

		String path = "C:\\workspaces\\eclipse_workspace\\Udemy_Java_Completo_2021\\secao17_01_Trabalhando_com_arquivos_File_e_Scanner\\out.txt";

		// com essa linha do try reescreve o arquivo
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
		// com a linha do try abaixo, o conteudo é acrescentado no arquivo original
		//try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {			
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}

		} 
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
