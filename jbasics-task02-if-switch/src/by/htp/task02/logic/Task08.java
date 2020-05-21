package by.htp.task02.logic;

// —оставить программу нахождени€ наименьшего из квадратов двух чисел а и b.

public class Task08 {

	public static void task() {

		double a, b, a2, b2;

		a = -2;
		b = 1;

		a2 = a * a;
		b2 = b * b;

		if (a2 < b2) {
			System.out.println("8.  вадрат числа a меньше квадрата числа b.");
		} else if (a2 > b2) {
			System.out.println("8.  вадрат числа b меньше квадрата числа a.");
		} else {
			System.out.println("8.  вадраты чисел a и b равны.");
		}
	}

}
