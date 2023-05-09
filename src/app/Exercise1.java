package app;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise1 {

	public static void main(String[] args) {
		Set<String> words = new HashSet<>();
		Set<String> duplicated = new HashSet<>();

		System.out.print("Determina il numero di elementi da inserire: ");
		Scanner sc = new Scanner(System.in);
		int nElements = sc.nextInt();
		sc.nextLine();

		int i = 1;
		do {
			System.out.println("Inserire l'elemento numero " + i);
			String currentWord = sc.nextLine();

			for (String w : words) {
				if (currentWord.equals(w)) {
					duplicated.add(currentWord);
				}
			}

			words.add(currentWord);
			i++;

		} while (i <= nElements);

		sc.close();

		System.out.println("\t -Numero di parole distinte: " + words.size());
		System.out.println("\t -Elenco parole duplicate: " + duplicated);
		System.out.println("\t -Elenco parole distinte: " + words);
	}

}
