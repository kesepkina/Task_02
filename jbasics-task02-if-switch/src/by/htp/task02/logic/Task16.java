package by.htp.task02.logic;

// �� ��������� ��Y ������ ������ ������������ ����� �.
// �������, ��� ��� ����������� (�� ����� ��� ��� � ����� ������������ ����).

public class Task16 {

	public static void task() {

		double x, y;

		x = -1;
		y = 2;

		if (x == 0) {
			System.out.println("16. ����� � ����������� �� ��� Oy.");
		} else {
			if (y == 0) {
				System.out.println("16. ����� � ����������� �� ��� Ox.");
			} else {
				if (x > 0) {
					if (y > 0) {
						System.out.println("16. ����� � ����������� � ������ ������������ ��������.");
					} else {
						System.out.println("16. ����� � ����������� � �������� ������������ ��������.");
					}
				} else {
					if (x < 0) {
						if (y > 0) {
							System.out.println("16. ����� � ����������� �� ������ ������������ ��������.");
						} else {
							System.out.println("16. ����� � ����������� � ������� ������������ ��������.");
						}
					}
				}
			}
		}

	}

}
