package by.htp.task02.logic;

// ���� ����� ����� t, p. ���� ����� �� �����, �� �������� ������ �� ��� ����� �
// ��� �� ������, ������ �������� �� ��������, � ���� �����, �� �������� ����� ������.

public class Task17 {

	public static void task() {

		int t, p;

		t = 1;
		p = 1;

		if (t > p) {
			p = t;
		} else if (p > t) {
			t = p;
		} else {
			t = 0;
			p = 0;
		}

		System.out.println("17. �������� �������� t � p ��������������: " + t + ", " + p);

	}

}
