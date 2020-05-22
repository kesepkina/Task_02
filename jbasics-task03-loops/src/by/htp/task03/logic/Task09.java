package by.htp.task03.logic;

// Найти сумму квадратов первых ста чисел.

public class Task09 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i < 100; i++) { // Считаем, что ноль входит в первую сотню чисел
			sum += i * i;
		}

		System.out.println("sum = " + sum);

	}

}
