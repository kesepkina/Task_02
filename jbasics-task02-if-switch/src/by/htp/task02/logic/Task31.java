package by.htp.task02.logic;

// ������ ������� �, � �������������� ��������� � ������� �, �, z �������.
// ����������, ������� �� ������ ����� ���������.

public class Task31 {

	public static void task() {

		double a, b, x, y, z;

		a = 20.2;
		b = 10.7;

		x = 5.9;
		y = 19;
		z = 31;

		if ((x < a && (y < b || z < b)) || (x < b && (y < a || z < a)) || (y < a && z < b) || (z < a && y < b)) {
			System.out.println("31. ������ ������ ����� ���������.");

		} else {
			System.out.println("31. ������ �� ������ ����� ���������.");
		}

	}

}
