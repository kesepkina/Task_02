package by.htp.task02.logic;

// ��������� ���������, ������� ��������� ������� ������ ������������ ������.

public class Task11 {

	public static void task() {

		double h1, a1, h2, a2, s1, s2;

		h1 = 12; // ������ ������� ������������
		a1 = 6; // ������� ������� ������������

		h2 = 8;
		a2 = 10;

		s1 = a1 * h1 / 2;
		s2 = a2 * h2 / 2;

		if (s1 < s2) {
			System.out.println("11. ������� ������� ������������ ������.");
		} else if (s2 < s1) {
			System.out.println("11. ������� ������� ������������ ������.");
		} else {
			System.out.println("11. ������� ����� ������������� ���������.");
		}

	}

}
