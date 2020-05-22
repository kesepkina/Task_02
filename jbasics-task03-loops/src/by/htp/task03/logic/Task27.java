package by.htp.task03.logic;

/*Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и
самого числа. m и n вводятся с клавиатуры.*/

public class Task27 {

	public static void main(String[] args) {

		int m, n;

		m = 14;
		n = 24;

		for (int i = m; i <= n; i++) {
			System.out.print(i + ":  ");
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}

	}

}
