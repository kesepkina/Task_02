package by.htp.task02.logic;

// ���� �������������� ����� �,b,�. ������� ��� �����,
// ���� � > b > �, � �������� �� ����������� ����������, ���� ��� �� ���.

import static java.lang.Math.abs;

public class Task30 {

	public static void task() {

		double a, b, c;

		a = -3;
		b = 2;
		c = 0;

		if (a > b && b > c) {
			a = 2 * a;
			b = 2 * b;
			c = 2 * c;
		} else {
			a = abs(a);
			b = abs(b);
			c = abs(c);
		}

		System.out.println("30. �������� �������� a, b � c: " + a + ", " + b + ", " + c);

	}

}
