package by.htp.task02.logic;

// ���� ��� ���� ������������ (� ��������).
// ����������, ���������� �� ����� �����������, � ���� ��, �� ����� �� �� �������������.

public class Task14 {

	public static void task() {

		double a, b;

		a = 30;
		b = 90;

		if (a + b < 180) {
			System.out.print("14. ����������� ����������.");
			if (a == 90 || b == 90 || a + b == 90) {
				System.out.println(" �� �������� �������������.");
			} else {
				System.out.println(" �� �� �������� �������������.");
			}
		} else {
			System.out.println("14. ����������� �� ����������.");
		}
	}

}
