package by.htp.task03.logic;

import java.util.Scanner;

// Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.

public class Task14 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		double sum = 0;

		System.out.print("n = ");
		while (!sc.hasNextInt()) {
			sc.hasNext();
			System.out.print("n = ");
		}
		int n = sc.nextInt();

		for (double i = 1; i <= n; i++) {
			sum += 1 / i;
		}

		System.out.println("Sum = " + sum);

	}

}
