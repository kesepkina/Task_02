package by.htp.task02.logic;

// Даны целые числа t, p. Если числа не равны, то заменить каждое из них одним и
// тем же числом, равным большему из исходных, а если равны, то заменить числа нулями.

public class Task17 {

	public static void task() {

		int t, p;

		t = 1;
		p = 1;

		if (t > p) {
			p = t;
		} else if (p > t) {
			t = p;
		} else {
			t = 0;
			p = 0;
		}

		System.out.println("17. Итоговые значения t и p соответственно: " + t + ", " + p);

	}

}
