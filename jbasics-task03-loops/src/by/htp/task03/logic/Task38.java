package by.htp.task03.logic;

// ��� ��������� ������������ ����� ����������, �������� �� ��� ����� ��������������
// ����������. ��������������, ��� � ����� �� ����� ��� ����. ��������: 1357, 963.

public class Task38 {

	public static void main(String[] args) {

		int x, cipher, precipher, d;
		boolean arifm;

		x = 13579;
		arifm = true;

		precipher = x % 10;
		x = (x - precipher) / 10;
		cipher = x % 10;
		x = (x - cipher) / 10;
		d = cipher - precipher;
		precipher = cipher;

		while (x != 0) {
			cipher = x % 10;
			if (cipher - precipher != d) {
				arifm = false;
				break;
			}
			x = (x - cipher) / 10;
			precipher = cipher;
		}

		if (arifm) {
			System.out.println("����� ������� ����� �������� �������������� ����������.");
		} else {
			System.out.println("����� ������� ����� �� �������� �������������� ����������.");
		}

	}

}
