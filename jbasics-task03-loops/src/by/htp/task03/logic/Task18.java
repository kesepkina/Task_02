package by.htp.task03.logic;

// ���� �������� ��� � ��������� ����� �. ����� ����� ��� ������ ����, ������ ������� ������ ���
// ����� ��������� �.

public class Task18 {

	public static void main(String[] args) {

		double e, sum, a, i;

		a = 1;
		i = 1;
		sum = 0;
		e = 0.3;

		while (Math.abs(a) >= e) {
			sum += a;
			i++;
			a = Math.pow(-1, i - 1) / i;
		}

		System.out.println("Sum = " + sum);

	}

}
