package by.htp.task03.logic;

/*���� ��� ���������� ����� � � �. �� ���� ����� ��������� 2 �������������� �����: ������ �����
�������� ����� ��������� ������� ����� �, ����� �. ��� ��������� ������� ����� ������� ��������
����� �, ����� �. ����� ����� � � � ���� �������� , ��� ������ �������������� ����� ������ �������
�� 99, � ������ �� 49.*/

public class Task37 {

	public static void main(String[] args) {

		for (int x = 10; x < 100; x++) {
			for (int y = 10; y < 100; y++) {
				if (((100 * x + y) % 99 == 0) && ((100 * y + x) % 49 == 0)) {
					System.out.println(x + " " + y);
				}
			}
		}

	}

}
