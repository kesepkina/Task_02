package by.htp.task03.logic;

// Для заданного натурального числа определить, образуют ли его цифры арифметическую
// прогрессию. Предполагается, что в числе не менее трёх цифр. Например: 1357, 963.

public class Task38 {

	public static void main(String[] args) {

		int x, cipher, precipher, d;
		boolean arifm;

		x = 13579;
		arifm = true;

		precipher = x % 10;
		x = (x - precipher) / 10;
		cipher = x % 10;
		x = (x - cipher) / 10;
		d = cipher - precipher;
		precipher = cipher;

		while (x != 0) {
			cipher = x % 10;
			if (cipher - precipher != d) {
				arifm = false;
				break;
			}
			x = (x - cipher) / 10;
			precipher = cipher;
		}

		if (arifm) {
			System.out.println("Цифры данного числа образуют арифметическую прогрессию.");
		} else {
			System.out.println("Цифры данного числа не образуют арифметическую прогрессию.");
		}

	}

}
