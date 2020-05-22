package by.htp.task03.logic;

// Вычислить значения функции на отрезке [а,b] c шагом h

public class Task07 {

	public static void main(String[] args) {

		double a, b, h, x;

		a = 0;
		b = 4;
		h = 0.5;

		for (x = a; x <= b; x += h) {
			if (x <= 2) {
				System.out.println("f(" + x + ") = " + -x);
			} else {
				System.out.println("f(" + x + ") = " + x);
			}
		}

	}

}
