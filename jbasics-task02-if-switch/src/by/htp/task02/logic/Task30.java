package by.htp.task02.logic;

// ƒаны действительные числа а,b,с. ”двоить эти числа,
// если а > b > с, и заменить их абсолютными значени€ми, если это не так.

import static java.lang.Math.abs;

public class Task30 {

	public static void task() {

		double a, b, c;

		a = -3;
		b = 2;
		c = 0;

		if (a > b && b > c) {
			a = 2 * a;
			b = 2 * b;
			c = 2 * c;
		} else {
			a = abs(a);
			b = abs(b);
			c = abs(c);
		}

		System.out.println("30. »тоговые значени€ a, b и c: " + a + ", " + b + ", " + c);

	}

}
