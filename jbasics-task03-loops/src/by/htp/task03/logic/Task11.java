package by.htp.task03.logic;

// Составить программу нахождения разности кубов первых двухсот чисел

public class Task11 {

	public static void main(String[] args) {

		int dif;
		dif = 1 * 1 * 1;

		for (int i = 2; i < 201; i++) {
			dif -= i * i * i;
		}

		System.out.println("Difference = " + dif);

	}

}
