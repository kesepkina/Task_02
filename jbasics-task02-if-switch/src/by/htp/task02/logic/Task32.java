package by.htp.task02.logic;

import java.util.Scanner;

// �������� ���������, ������� �� �������� ���� ������ ����������,
// �������� �� ����� �����-���� ���� �� ��� �������������.

public class Task32 {

	public static void task() {

		double x, y, z;
		boolean positiv = false;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("32. x: ");

		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("    x: ");
		}

		x = sc.nextDouble();

		System.out.print("    y: ");

		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("    y: ");
		}

		y = sc.nextDouble();

		System.out.print("    z: ");

		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("    z: ");
		}

		z = sc.nextDouble();

		if (x + y > 0) {
			System.out.println("    ����� x � y ������������.");
			positiv = true;
		}

		if (z + y > 0) {
			System.out.println("    ����� z � y ������������.");
			positiv = true;
		}

		if (x + z > 0) {
			System.out.println("    ����� x � z ������������.");
			positiv = true;
		}

		if (positiv == false) {
			System.out.println("    ��� ��� ����� ��������������.");
		}

	}

}
