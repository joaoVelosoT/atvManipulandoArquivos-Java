package Functions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Functions {

	Scanner sc = new Scanner(System.in);

	public ArrayList<String> tabuada(int numTabuada, int itemTabuada) {
		
		ArrayList<String> list = new ArrayList();
		int result = 0;
		list.add("Taboada do "+numTabuada);
		for (int i = 1; i < itemTabuada+1; i++) {
			result = numTabuada * i;
			list.add(numTabuada + " X " + i + " = " + Integer.toString(result));
		}
		list.add("");
		return list;
	}

	public void writeToFile(String fileName, String content) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
			writer.write(content);
			writer.newLine();
		} catch (Exception e) {
			System.out.println("Erro ao escrever no arquvio");
		}
	}

	public String readFromFile(String fileName) {
		StringBuilder content = new StringBuilder();
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = reader.readLine()) != null) {
				content.append(line).append("\n");
			}
		} catch (Exception e) {
			System.out.println("Erro ao ler do arquivo: " + e.getMessage());
		}

		return content.toString();
	}

}
