package app;

import java.util.HashMap;
import java.util.Map;

public class Exercise3 {

	public static void main(String[] args) {
		Map<String, String> phoneBook = new HashMap<>();

		addPhone(phoneBook, "Mario", "03432710616");
		addPhone(phoneBook, "Maria", "03432728346");

		removePhone(phoneBook, "Mario");

		searchPerson(phoneBook, "03432728346");
		searchPerson(phoneBook, "123456789");

		searchPhone(phoneBook, "Maria");
		searchPhone(phoneBook, "Giovanni");

		printPhoneBook(phoneBook);

	}

	public static void addPhone(Map<String, String> phoneBook, String name, String phone) {
		phoneBook.put(name, phone);

	}

	public static void removePhone(Map<String, String> phoneBook, String name) {
		phoneBook.remove(name);

	}

	public static void searchPerson(Map<String, String> phoneBook, String phone) {

		for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
			if (entry.getValue().equals(phone)) {
				System.out.println("La persona che stai cercando è: " + entry.getKey());
				return;
			}
		}
		System.out.println("Nessuna persona trovata con questo numero di telefono.");
	}

	public static void searchPhone(Map<String, String> phoneBook, String name) {

		if (phoneBook.containsKey(name)) {
			System.out.println("Il numero di telefono di " + name + " è: " + phoneBook.get(name));
		} else {
			System.out.println("Nessun numero di telefono trovato per " + name);
		}
	}

	public static void printPhoneBook(Map<String, String> phoneBook) {
		for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
			System.out.println("Nome: " + entry.getKey() + ", Telefono: " + entry.getValue());
		}
	}

}
