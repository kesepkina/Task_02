package by.htp.task02.logic;

// Найти max{min(a, b), min(c, d)}.

public class Task27 {

	public static void task() {

		double a, b, c, d, minab, mincd, max;

		a = 1;
		b = 0;
		c = 32;
		d = 23;

		if (a <= b) {
			minab = a;
		} else {
			minab = b;
		}

		if (c <= d) {
			mincd = c;
		} else {
			mincd = d;
		}

		if (minab >= mincd) {
			max = minab;
		} else {
			max = mincd;
		}

		System.out.println("27. max{min(a, b), min(c, d)} = " + max);
	}

}
