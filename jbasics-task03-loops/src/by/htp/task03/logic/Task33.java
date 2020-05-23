package by.htp.task03.logic;

// Найдите наибольшую цифру данного натурального числа.

public class Task33 {

	public static void main(String[] args) {

		int x, cipher, max;

		x = 11117110;

		cipher = x % 10;
		max = cipher;
		x = (x - cipher) / 10;

		while (x != 0) {
			cipher = x % 10;
			if (max < cipher) {
				max = cipher;
			}
			x = (x - cipher) / 10;
		}

		System.out.println(max);

	}

}
