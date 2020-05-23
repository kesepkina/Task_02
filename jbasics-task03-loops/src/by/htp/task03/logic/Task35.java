package by.htp.task03.logic;

// Найдите количество четных цифр данного натурального числа.

public class Task35 {

	public static void main(String[] args) {

		int x, num, cipher;

		x = 1246;
		num = 0;

		while (x != 0) {
			cipher = x % 10;
			if (cipher % 2 == 0) {
				num++;
			}
			x = (x - cipher) / 10;
		}

		System.out.println(num);

	}

}
