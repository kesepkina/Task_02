package by.htp.task02.logic;

// ���� �������������� ����� � � �, �� ������ ���� �����.
// ������� �� ���� ���� ����� �������� ��������� �� �����, � ������� � �� ��������� �������������.

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

		System.out.println("15. �������� �������� x � y ����� �������������� " + x + " � " + y);

	}

}
