package by.htp.task02.logic;

// ��������� ��������� ���������� ����������� �� ��������� ���� ����� � � b.

public class Task08 {

	public static void task() {

		double a, b, a2, b2;

		a = -2;
		b = 1;

		a2 = a * a;
		b2 = b * b;

		if (a2 < b2) {
			System.out.println("8. ������� ����� a ������ �������� ����� b.");
		} else if (a2 > b2) {
			System.out.println("8. ������� ����� b ������ �������� ����� a.");
		} else {
			System.out.println("8. �������� ����� a � b �����.");
		}
	}

}
