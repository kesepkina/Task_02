package by.htp.task02.logic;

// Составить программу, которая определит по трем
// введенным сторонам, является ли данный треугольник равносторонним.

public class Task09 {

	public static void task() {

		double a, b, c;

		a = 1;
		b = 1;
		c = 1;

		if (a == b && a == c) {
			System.out.println("9. Треугольник является равносторонним.");
		} else {
			System.out.println("9. Треугольник не является равносторонним.");
		}
	}

}
