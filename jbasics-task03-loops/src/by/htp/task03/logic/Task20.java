package by.htp.task03.logic;

// ���� �������� ��� � ��������� ����� �. ����� ����� ��� ������ ����, ������ ������� ������ ���
// ����� ��������� �.

public class Task20 {

	public static void main(String[] args) {

		double e, sum, a, i;

		a = -0.5;
		i = 0;
		sum = 0;
		e = 0.2;

		while (Math.abs(a) >= e) {
			sum += a;
			i++;
			a = 1 / ((3 * i - 2) * (3 * i + 1));
		}

		System.out.println("Sum = " + sum);

	}

}
