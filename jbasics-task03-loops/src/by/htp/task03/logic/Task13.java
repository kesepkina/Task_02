package by.htp.task03.logic;

// ��������� ������� �������� ������� y = 5 - x2/2 �� ������� [-5; 5] � ����� 0.5.

public class Task13 {

	public static void main(String[] args) {

		for (double x = -5; x <= 5; x += 0.5) {
			System.out.println("y(" + x + ") = " + (5 - x * x / 2));
		}

	}

}
