package by.htp.task02.logic;

// ���� ��� ����� a, b, �. ����������, ����� �� ��� ����� d.
// ���� �� ���� �� ����� d, �� ����� max(d � a, d � b, d �c).

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
				System.out.println("28. max(d � a, d � b, d �c) = " + da);
			} else if (db >= da && db >= dc) {
				System.out.println("28. max(d � a, d � b, d �c) = " + db);
			} else {
				System.out.println("28. max(d � a, d � b, d �c) = " + dc);
			}
		}
	}

}
