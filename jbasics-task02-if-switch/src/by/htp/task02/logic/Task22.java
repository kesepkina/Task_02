package by.htp.task02.logic;

// ���������������� �������� ���������� � � � ���,
// ����� � � ��������� ������� �� ���� ��������, � � y - �������.

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

		System.out.println("22. �������� �������� x � y ��������������: " + x + ", " + y);

	}

}
