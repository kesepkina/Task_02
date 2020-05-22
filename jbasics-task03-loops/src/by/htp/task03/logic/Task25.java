package by.htp.task03.logic;

// Требуется определить факториал числа, которое ввел пользователь.

public class Task25 {

	public static void main(String[] args) {

		int x, mul;

		x = 5;
		mul = 1;

		for (int i = 1; i <= x; i++) {
			mul *= i;
		}

		System.out.println(x + "! = " + mul);

	}

}
