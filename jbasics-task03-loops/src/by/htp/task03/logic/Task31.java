package by.htp.task03.logic;

import java.util.Random;

/*Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек пытается их
угадать. Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала
программа, а также ошибочные числа пользователя.*/

public class Task31 {

	public static void main(String[] args) {

		Random rand = new Random();

		int comp[], user[];
		boolean guess[], right[];

		user = new int[5];
		comp = new int[5];
		guess = new boolean[6];
		right = new boolean[5];

		for (int i = 0; i < 5; i++) {
			comp[i] = rand.nextInt(15) + 1;
		}

		for (int i = 0; i < 5; i++) {
			user[i] = rand.nextInt(15) + 1;
			for (int j = 0; j < 5; j++) {
				if (comp[j] == user[i]) {
					guess[j] = true;
					guess[5] = true;
					right[i] = true;
				}
			}
		}

		if (guess[5] == true) {

			System.out.print("Ты угадал: ");

			for (int i = 0; i < 5; i++) {
				if (guess[i] == true) {
					System.out.print(comp[i] + " ");
					guess[5] = true;
				}
			}
		}

		System.out.println();
		System.out.print("Эти числа ты не угадал: ");
		for (int i = 0; i < 5; i++) {
			if (guess[i] == false) {
				System.out.print(comp[i] + " ");
			}
		}
		System.out.println();
		System.out.print("Вот твои числа, которые я не загадывал: ");
		for (int i = 0; i < 5; i++) {
			if (right[i] == false) {
				System.out.print(user[i] + " ");
			}
		}

	}

}
