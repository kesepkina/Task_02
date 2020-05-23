package by.htp.task03.logic;

/*Получить все числа, не превышающие заданного числа N, которые делятся без остатка на все свои
цифры.*/

public class Task40 {

	public static void main(String[] args) {

		int n, cipher, t;
		boolean bool;

		n = 100;

		for (int x = 1; x <= n; x++) {
			bool = true;
			t = x;
			while (t != 0) {
				cipher = t % 10;
				if (cipher != 0 && x % cipher != 0) {
					bool = false;
					break;
				}
				t = (t - cipher) / 10;
			}
			if (bool) {
				System.out.println(x);
			}
		}

	}

}
