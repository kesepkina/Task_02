package by.htp.task03.logic;

// Вычислить значения функции на отрезке [а,b] c шагом h

public class Task08 {

	public static void main(String[] args) {

		double a, b, h, c;

		a = 11;
		b = 17;
		h = 2;
		c = 1;

		for (double x = a; x <= b; x += h) {
			if (x != 15) {
				System.out.println("f(" + x + ") = " + (x + c) * 2);
			} else {
				System.out.println("f(" + x + ") = " + (x - c + 6));
			}

		}

	}

}
