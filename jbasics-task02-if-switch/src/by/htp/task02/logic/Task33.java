package by.htp.task02.logic;

import java.util.Scanner;

// �������� ���������, ������� �� ������ ����� ����������
// ������� ������� ���������� � ��������� ���������� � ���� ������.
// ������ � ���� ����� ������ ����� �������, �������� �� ��� ������ �� ������� �������.
// ��� ����� ��������� ������: 9583, 1747 � �������� ������ ��� �, �, �;
// 3331, 7922 � �������� ������ ��� �, �; 9455, 8997 � �������� ������ ���� �.

public class Task33 {

	public static void task() {

		int password;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("33. Input password: ");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("    Input password: ");
		}

		password = sc.nextInt();

		if (password == 9583 || password == 1747) {
			System.out.println("    You have access to the date elements A, B and C.");
		} else if (password == 3331 || password == 7922) {
			System.out.println("    You have access to the date elements B and C.");
		} else if (password == 9455 || password == 8997) {
			System.out.println("    You have access to the date element C.");
		} else {
			System.out.println("    You don't have access to any date element.");
		}

	}

}
