package by.htp.task02.logic;

// Даны две точки А(х1, у1) и В(х2, у2).
// Составить алгоритм, определяющий, которая из точек находится ближе к началу координат.

public class Task13 {

	public static void task() {

		double x1, x2, y1, y2, d1, d2;

		x1 = 0;
		y1 = -2;

		x2 = 2;
		y2 = 1;

		d1 = Math.sqrt(x1 * x1 + y1 * y1);
		d2 = Math.sqrt(x2 * x2 + y2 * y2);

		if (d1 < d2) {
			System.out.println("13. Точка (" + x1 + "," + y1 + ") находится ближе к началу координат.");
		} else if (d2 < d1) {
			System.out.println("13. Точка (" + x2 + "," + y2 + ") находится ближе к началу координат.");
		} else {
			System.out.println("13. Точки находятся на одинаковом расстоянии от начала координат.");
		}
	}

}
