package by.htp.task03.logic;

// � ������� ��������� while �������� ��������� ����������� ����� ���� �������� ����� �
// ��������� �� 1 �� 99 ������������.

public class Task05 {

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;

		while (i < 100) {
			if (i % 2 == 1) {
				sum += i;
			}

			i++;
		}

		System.out.println(" sum = " + sum);

	}

}
