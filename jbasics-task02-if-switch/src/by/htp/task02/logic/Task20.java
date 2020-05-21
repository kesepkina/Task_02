package by.htp.task02.logic;

// Определить, делителем каких чисел а, b, с является число k.

public class Task20 {

	public static void task() {

		int a, b, c, k;
		boolean are;

		are = false;

		a = 9;
		b = 11;
		c = 99;

		k = 3;

		System.out.print("20. ");

		if (a % k == 0) {
			System.out.print(a + "  ");
			are = true;
		}

		if (b % k == 0) {
			System.out.print(b + "  ");
			are = true;
		}

		if (c % k == 0) {
			System.out.print(c + "  ");
			are = true;
		}

		if (are == true) {
			System.out.println("- числа, делящиеся на " + k + " без остатка.");
		} else {
			System.out.println("Ни одно из предложенных чисел не делится на " + k + " без остатка.");
		}
	}

}
