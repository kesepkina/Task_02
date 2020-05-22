package by.htp.task03.logic;

public class Task19 {

	public static void main(String[] args) {

		double e, sum, a, i;

		a = 2;
		i = 0;
		sum = 0;
		e = 0.8;

		while (Math.abs(a) >= e) {
			sum += a;
			i++;
			a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
		}

		System.out.println("Sum = " + sum);

	}

}
