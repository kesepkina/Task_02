package by.htp.task02.logic;

// ���� ��� �������������� �����. �������� � ������� �� �� ���,
// �������� ������� ��������������, � � ��������� ������� � �������������.

public class Task12 {

	public static void task() {

		double a, b, c;

		a = 2;
		b = -3;
		c = 0;

		if (a >= 0) {
			a = a * a;
		} else {
			a = Math.pow(a, 4);
		}

		if (b >= 0) {
			b = b * b;
		} else {
			b = Math.pow(b, 4);
		}

		if (c >= 0) {
			c = c * c;
		} else {
			c = Math.pow(c, 4);
		}

		System.out.println("12. �������� ��������: " + a + ", " + b + ", " + c);
	}

}
