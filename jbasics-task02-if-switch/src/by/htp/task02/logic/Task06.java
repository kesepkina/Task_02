package by.htp.task02.logic;

// —оставить программу: определени€ наибольшего из двух чисел а и b.

public class Task06 {
	
	public static void task() {
		
		double a, b;

		a = 1;
		b = -1;

		if (a > b) {
			System.out.println("5. a - наибольшее.");
		} else if (b > a) {
			System.out.println("5. b - наибольшее.");
		} else {
			System.out.println("5. a и b равны.");
		}
	}

}
