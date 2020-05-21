package by.htp.task02.logic;

// ƒаны три числа a, b, с. ќпределить, какое из них равно d.
// ≈сли ни одно не равно d, то найти max(d Ч a, d Ч b, d Чc).

public class Task28 {

	public static void task() {

		double a, b, c, d, da, db, dc;

		a = 1;
		b = 2;
		c = 3;
		d = 4;

		if (a == d) {
			System.out.println("28. a==d");
		} else if (b == d) {
			System.out.println("28. b==d");
		} else if (c == d) {
			System.out.println("28. c==d");
		} else {
			da = d - a;
			db = d - b;
			dc = d - c;
			if (da >= db && da >= dc) {
				System.out.println("28. max(d Ч a, d Ч b, d Чc) = " + da);
			} else if (db >= da && db >= dc) {
				System.out.println("28. max(d Ч a, d Ч b, d Чc) = " + db);
			} else {
				System.out.println("28. max(d Ч a, d Ч b, d Чc) = " + dc);
			}
		}
	}

}
