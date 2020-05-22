package by.htp.task03.logic;

// Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).

public class Task16 {

	public static void main(String[] args) {

		long mul = 1;
		long sum = 0;

		for (long i = 1; i < 11; i++) {
			sum += i;
			mul *= sum;
		}

		System.out.println("(1+2)*(1+2+3)*...*(1+2+...+10) = " + mul);

	}

}
