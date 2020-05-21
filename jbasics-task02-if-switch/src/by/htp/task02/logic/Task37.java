package by.htp.task02.logic;

public class Task37 {

	public static void task() {

		double x, y;

		x = 1;

		if (x >= 3) {
			y = -x * x + 3 * x + 9;
		} else {
			y = 1 / (Math.pow(x, 3) - 6);
		}

		System.out.println("37. F(" + x + ") = " + y);
	}

}
