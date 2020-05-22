package by.htp.task03.logic;

/*�������� ����������� �����. ����� ����� ������ ����, �������� � ��� ������. �������������
��� � ������ �����, ����� �������� ����� ��������� � �������� ������� �� ��������� � ���������
������.*/

public class Task24 {

	public static void main(String[] args) {

		int x, sum, x2, cipher;

		x = 23524323;
		sum = 0;
		x2 = 0;

		while (x != 0) {
			cipher = x % 10;
			if (cipher % 2 == 0) {
				sum += cipher;
			}
			x2 = 10 * x2 + cipher;
			x = (x - cipher) / 10;
		}

		System.out.println("Sum = " + sum);
		System.out.println("Inverse = " + x2);

	}

}
