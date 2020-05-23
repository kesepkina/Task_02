package by.htp.task03.logic;

import java.util.Random;

/*��������� ���������� ���� ����� � ��������� �� 1 �� 15 ������������. ������� �������� ��
�������. ��������� ������ �������� ��������� � ����������� ����� �� ���, ��� �������������
���������, � ����� ��������� ����� ������������.*/

public class Task31 {

	public static void main(String[] args) {

		Random rand = new Random();

		int comp[], user[];
		boolean guess[], right[];

		user = new int[5];
		comp = new int[5];
		guess = new boolean[6];
		right = new boolean[5];

		for (int i = 0; i < 5; i++) {
			comp[i] = rand.nextInt(15) + 1;
		}

		for (int i = 0; i < 5; i++) {
			user[i] = rand.nextInt(15) + 1;
			for (int j = 0; j < 5; j++) {
				if (comp[j] == user[i]) {
					guess[j] = true;
					guess[5] = true;
					right[i] = true;
				}
			}
		}

		if (guess[5] == true) {

			System.out.print("�� ������: ");

			for (int i = 0; i < 5; i++) {
				if (guess[i] == true) {
					System.out.print(comp[i] + " ");
					guess[5] = true;
				}
			}
		}

		System.out.println();
		System.out.print("��� ����� �� �� ������: ");
		for (int i = 0; i < 5; i++) {
			if (guess[i] == false) {
				System.out.print(comp[i] + " ");
			}
		}
		System.out.println();
		System.out.print("��� ���� �����, ������� � �� ���������: ");
		for (int i = 0; i < 5; i++) {
			if (right[i] == false) {
				System.out.print(user[i] + " ");
			}
		}

	}

}
