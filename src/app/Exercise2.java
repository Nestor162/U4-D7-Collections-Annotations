package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		firstFunc();

		ArrayList<Integer> list3 = new ArrayList<>();
		for (int i = 1; i <= 9; i++) {
			list3.add(i);
		}

		System.out.print("Mostrare numeri pari (true/false)?: ");
		Scanner sc = new Scanner(System.in);
		boolean odd = sc.nextBoolean();
		sc.nextLine();
		thirdFunc(list3, odd);
		sc.close();

	}

	public static void firstFunc() {
		System.out.print("Determina il numero di elementi da inserire: ");
		Scanner sc = new Scanner(System.in);
		int nElements = sc.nextInt();
		sc.nextLine();

		ArrayList<Integer> list1 = new ArrayList<>();

		for (int i = 1; i <= nElements; i++) {
			int randomNumber = (int) Math.floor(Math.random() * 100);
			list1.add(i - 1, randomNumber);
		}

		Collections.sort(list1);
		System.out.println(list1);

		secondFunc(list1);

	}

	public static void secondFunc(ArrayList<Integer> list1) {

		ArrayList<Integer> list1Reverse = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		list2.addAll(list1);
		list1Reverse.addAll(list1);
		Collections.sort(list1Reverse, Collections.reverseOrder());
		list2.addAll(list1Reverse);

		System.out.println(list2);
	}

	public static void thirdFunc(ArrayList<Integer> list3, boolean odd) {

		ArrayList<Integer> listOdd = new ArrayList<>();
		ArrayList<Integer> listEven = new ArrayList<>();

		for (int i = 0; i < list3.size(); i++) {
			if (i % 2 == 0) {
				listOdd.add(list3.get(i));
			} else {
				listEven.add(list3.get(i));
			}
		}

		if (!odd) {
			System.out.println(listOdd);
		} else {
			System.out.println(listEven);
		}

	}

}
