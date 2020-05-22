package by.htp.task03.logic;

// ƒаны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)

public class Task17 {

	public static void main(String[] args) {

		double a, mul;
		int n;

		a = 1.5;
		n = 3;
		mul = 1;

		for (int i = 1; i <= n; i++) {
			mul *= a + i - 1;
		}

		System.out.println("a(a+1)...(a+n-1) = " + mul);

	}

}
