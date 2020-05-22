package by.htp.task03.logic;

// Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 Составьте программу
// нахождения произведения первых 10 членов этой последовательности.

public class Task12 {

	public static void main(String[] args) {

		long a = 1L;
		long mul = a;

		for (long i = 2L; i < 11L; i++) {
			a += 6L;
			mul *= a;
		}

		System.out.println("Multiply = " + mul);

	}

}
