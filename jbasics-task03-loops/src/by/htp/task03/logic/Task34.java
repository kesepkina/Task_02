package by.htp.task03.logic;

// Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.

public class Task34 {

	public static void main(String[] args) {

		int sum, cipher, t;

		for (int i = 1000; i < 10000; i++) {

			sum = 0;

			t = i;
			while (t != 0) {
				cipher = t % 10;
				sum += cipher;
				t = (t - cipher) / 10;
			}

			if (sum == 15) {
				System.out.print(i + " ");
			}
		}

	}

}
