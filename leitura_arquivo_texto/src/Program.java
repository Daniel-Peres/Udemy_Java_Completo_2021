import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Program {

	public static void main(String[] args) {

		String ano2020 = "c:\\temp\\arquivo2020.txt";
//		String ano2021 = "c:\\temp\\arquivo2021.txt";

		List<String[]> linhas = new ArrayList<>();

		String[] linha = null;
		
		Scanner sc = new Scanner(System.in);

		try (BufferedReader br = new BufferedReader(new FileReader(ano2020))) {

			String line = br.readLine();

			while (line != null) {
				linha = line.split(Pattern.quote("|"));
				linhas.add(linha);
				line = br.readLine();
			}

			System.out.print("Qual o registro: ");
			char registro = sc.next().charAt(0);

			for (String[] l : linhas) {			
				
				if (registro == l[0].charAt(0)) {				
					
					int[] campos = new int [l.length];					
					
					for(int i = 0 ; i < l.length ; i++) {
						campos[i] = i+1;
						System.out.print(campos[i] + "  | ");
					}
					System.out.println();
					System.out.println(String.join(" | ", l));

//					for (int i = 0; i < l.length; i++) {
//						System.out.println("Campo " + (i + 1) + ": " + l[i]);
////						System.out.println("Campo 04 : " + l[4]);
////						System.out.println("Campo 21 : " + l[21]);
//					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

}
