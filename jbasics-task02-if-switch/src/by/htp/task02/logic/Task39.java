package by.htp.task02.logic;

public class Task39 {

	public static void task() {

		double x, y;

		x = 1;

		if (x >= 8) {
			y = -x * x + x - 9;
		} else {
			y = 1 / (Math.pow(x, 4) - 6);
		}

		if (Math.pow(x, 4) == 6) {
			System.out.println("39. F(" + x + ") = infinity.");
		} else {
			System.out.println("39. F(" + x + ") = " + y);
		}
	}

}
