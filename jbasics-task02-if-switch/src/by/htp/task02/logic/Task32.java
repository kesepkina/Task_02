package by.htp.task02.logic;

import java.util.Scanner;

// Написать программу, которая по заданным трем числам определяет,
// является ли сумма каких-либо двух из них положительной.

public class Task32 {

	public static void task() {

		double x, y, z;
		boolean positiv = false;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("32. x: ");

		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("    x: ");
		}

		x = sc.nextDouble();

		System.out.print("    y: ");

		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("    y: ");
		}

		y = sc.nextDouble();

		System.out.print("    z: ");

		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("    z: ");
		}

		z = sc.nextDouble();

		if (x + y > 0) {
			System.out.println("    Сумма x и y положительна.");
			positiv = true;
		}

		if (z + y > 0) {
			System.out.println("    Сумма z и y положительна.");
			positiv = true;
		}

		if (x + z > 0) {
			System.out.println("    Сумма x и z положительна.");
			positiv = true;
		}

		if (positiv == false) {
			System.out.println("    Все три суммы неположительны.");
		}

	}

}
