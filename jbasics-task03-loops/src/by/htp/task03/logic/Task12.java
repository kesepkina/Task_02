package by.htp.task03.logic;

// ������������������ �n �������� ���: �1 = 1, an =6+ �n-1 , ��� ������� n >1 ��������� ���������
// ���������� ������������ ������ 10 ������ ���� ������������������.

public class Task12 {

	public static void main(String[] args) {

		long a = 1L;
		long mul = a;

		for (long i = 2L; i < 11L; i++) {
			a += 6L;
			mul *= a;
		}

		System.out.println("Multiply = " + mul);

	}

}
