package by.htp.task02.logic;

// Даны действительные числа х и у, не равные друг другу.
// Меньшее из этих двух чисел заменить половиной их суммы, а большее — их удвоенным произведением.

public class Task15 {

	public static void task() {

		double x, y, m, s;

		x = 2;
		y = 23;

		m = 2 * x * y;
		s = (x + y) / 2;

		if (x < y) {
			x = s;
			y = m;
		} else {
			y = s;
			x = m;
		}

		System.out.println("15. Итоговые значения x и y равны соответственно " + x + " и " + y);

	}

}
