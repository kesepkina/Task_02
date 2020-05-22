package by.htp.task03.logic;

// Напишите программу, где пользователь вводит любое целое положительное число. А программа
// суммирует все числа от 1 до введенного пользователем числа.

public class Task06 {

	public static void main(String[] args) {

		int x = 290;
		int sum = 0;

		for (int i = 1; i <= x; i++) {
			sum += i;
		}

		System.out.println("sum = " + sum);

	}

}
