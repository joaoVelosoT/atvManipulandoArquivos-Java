package Sistem;

import java.io.IOException;
import java.util.*;
import Functions.Functions;
import java.io.*;

public class Sistem {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		Functions Function = new Functions();
		int numTabuada = 0;
		int itemTabuada = 0;
		int result = 0;
		System.out.println("Qual tabuada voce deseja? ");
		numTabuada = sc.nextInt();
		System.out.println("Ate qual numero voce quer?");
		itemTabuada = sc.nextInt();

		Function.tabuada(numTabuada, itemTabuada).forEach(numeros -> {
			Function.writeToFile("tabuadaNew", numeros);
		});
		
		System.out.println(Function.readFromFile("tabuadaNew"));
	}

}
