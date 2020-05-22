package by.htp.task03.logic;

public class Task22 {

	public static void main(String[] args) {

		double a, b, h;

		a = -8;
		b = 8;
		h = 1;

		for (double x = a; x <= b; x += h) {

			System.out.println(x + " " + Math.pow(Math.sin(x), 2));
		}

	}

}
