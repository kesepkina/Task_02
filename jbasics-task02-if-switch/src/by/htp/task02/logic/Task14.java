package by.htp.task02.logic;

// Даны два угла треугольника (в градусах).
// Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.

public class Task14 {

	public static void task() {

		double a, b;

		a = 30;
		b = 90;

		if (a + b < 180) {
			System.out.print("14. Треугольник существует.");
			if (a == 90 || b == 90 || a + b == 90) {
				System.out.println(" Он является прямоугольным.");
			} else {
				System.out.println(" Он не является прямоугольным.");
			}
		} else {
			System.out.println("14. Треугольник не существует.");
		}
	}

}
