package by.htp.task02.logic;

// Перераспределить значения переменных х и у так,
// чтобы в х оказалось большее из этих значений, а в y - меньшее.

public class Task22 {

	public static void task() {

		double x, y, t;

		x = 1;
		y = 3.5;

		if (x < y) {
			t = x;
			x = y;
			y = t;
		}

		System.out.println("22. Итоговые значения x и y соответственно: " + x + ", " + y);

	}

}
