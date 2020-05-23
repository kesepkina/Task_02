package by.htp.task03.logic;

/*Два двузначных числа, записанных одно за другим , образуют четырёхзначное число, которое
делится на их произведение. Найти эти числа.*/

public class Task36 {

	public static void main(String[] args) {

		for (int x = 10; x < 100; x++) {
			for (int y = 10; y < 100; y++) {
				if ((100 * x + y) % (x * y) == 0) {
					System.out.println(x + " " + y);
				}
			}
		}

	}

}
