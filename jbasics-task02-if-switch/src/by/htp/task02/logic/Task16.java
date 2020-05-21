package by.htp.task02.logic;

// На плоскости ХОY задана своими координатами точка А.
// Указать, где она расположена (на какой оси или в каком координатном угле).

public class Task16 {

	public static void task() {

		double x, y;

		x = -1;
		y = 2;

		if (x == 0) {
			System.out.println("16. Точка А расположена на оси Oy.");
		} else {
			if (y == 0) {
				System.out.println("16. Точка А расположена на оси Ox.");
			} else {
				if (x > 0) {
					if (y > 0) {
						System.out.println("16. Точка А расположена в первой координатной четверти.");
					} else {
						System.out.println("16. Точка А расположена в четвёртой координатной четверти.");
					}
				} else {
					if (x < 0) {
						if (y > 0) {
							System.out.println("16. Точка А расположена во второй координатной четверти.");
						} else {
							System.out.println("16. Точка А расположена в третьей координатной четверти.");
						}
					}
				}
			}
		}

	}

}
