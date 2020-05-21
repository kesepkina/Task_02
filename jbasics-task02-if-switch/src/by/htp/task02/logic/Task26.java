package by.htp.task02.logic;

// Написать программу нахождения суммы большего и меньшего из трех чисел.

public class Task26 {

	public static void task() {

		double a, b, c, s;

		a = 1.4;
		b = 2345;
		c = -3.4;
		s = 0;

		if ((a >= b && c <= b) || (c >= b && a <= b)) {
			s = a + c;
		} else if ((a >= c && b <= c) || (b >= c && a <= c)) {
			s = a + b;
		} else if ((b >= a && c <= a) || (c >= a && b <= a)) {
			s = b + c;
		}

		System.out.println("26. Сумма равна " + s);

	}

}
