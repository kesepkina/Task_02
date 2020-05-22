package by.htp.task03.logic;

public class Task23 {

	public static void main(String[] args) {

		double a, b, h;

		a = -8;
		b = 8;
		h = 1;

		for (double x = a; x <= b; x += h) {

			System.out.println(x + " " + (1 / Math.tan(x / 3) + 0.5 * Math.sin(x)));
		}

	}

}
