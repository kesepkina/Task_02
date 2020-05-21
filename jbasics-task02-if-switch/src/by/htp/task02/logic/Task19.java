package by.htp.task02.logic;

// ѕодсчитать количество положительных среди чисел а, b, с.

public class Task19 {
	
	public static void task() {

		double a, b, c;
		int n;

		a = 1;
		b = 3;
		c = -1;

		n = 0;

		if (a > 0) {
			n++;
		}

		if (b > 0) {
			n++;
		}

		if (c > 0) {
			n++;
		}

		System.out.println("19.  оличество положительных чисел равно " + n);

	}

}
