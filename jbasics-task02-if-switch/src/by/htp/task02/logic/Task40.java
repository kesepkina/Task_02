package by.htp.task02.logic;

public class Task40 {

	public static void task() {

		double x, y;

		x = 1;

		if (x <= 13) {
			y = -Math.pow(x, 3) + 9;
		} else {
			y = -3 / (x + 1);
		}

		System.out.println("40. F(" + x + ") = " + y);
	}

}
