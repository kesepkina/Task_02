package by.htp.task03.logic;

// Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class Task29 {

	public static void main(String[] args) {

		int x, y, extrai, cipherx, ciphery;
		boolean cipher[];

		cipher = new boolean[10];

		x = 32369000;
		y = 435612309;

		while (x != 0) {
			cipherx = x % 10;
			extrai = y;
			while (extrai != 0) {
				ciphery = extrai % 10;
				if (ciphery == cipherx && !cipher[cipherx]) {
					System.out.print(cipherx + " ");
					cipher[cipherx] = true;
				}
				extrai = (extrai - ciphery) / 10;
			}
			x = (x - cipherx) / 10;
		}

	}

}
