package by.htp.task02.logic;

// Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

public class Task29 {

	public static void task() {

		double x1, y1, x2, y2, x3, y3;

		x1 = 1;
		y1 = 1;
		x2 = 1;
		y2 = 2;
		x3 = 1;
		y3 = 3;

		if (((x1 - x3) / (x2 - x3) == (y1 - y3) / (y2 - y3)) || (x1==x2 && x2==x3) || (y1==y2 && y2==y3)) {
			System.out.println("29. Точки расположены на одной прямой.");
		} else {
			System.out.println("29. Точки не расположены на одной прямой.");
		}
	}

}
