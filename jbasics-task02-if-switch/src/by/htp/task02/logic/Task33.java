package by.htp.task02.logic;

import java.util.Scanner;

// Написать программу, которая по паролю будет определять
// уровень доступа сотрудника к секретной информации в базе данных.
// Доступ к базе имеют только шесть человек, разбитых на три группы по степени доступа.
// Они имеют следующие пароли: 9583, 1747 — доступны модули баз А, В, С;
// 3331, 7922 — доступны модули баз В, С; 9455, 8997 — доступен модуль базы С.

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
