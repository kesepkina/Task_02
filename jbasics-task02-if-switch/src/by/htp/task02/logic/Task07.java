package by.htp.task02.logic;

// ��������� ��������� ���������� ������ ��������� a*x*x + b*x + c ��� �������� ��������� a, b, c � �

public class Task07 {

	public static void task() {

		double a, b, c, x, y;

		a = -1;
		b = 1;
		c = 1;

		x = -2;

		y = a * x * x + b * x + c;

		if (y < 0) {
			y = Math.abs(y);
		}

		System.out.println("7. a*x*x + b*x + c = " + y);
	}

}
