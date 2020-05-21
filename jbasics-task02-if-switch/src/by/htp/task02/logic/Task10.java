package by.htp.task02.logic;

// Составить программу, которая определит площадь какого круга меньше.

public class Task10 {

	public static void task() {
		
		double s1, s2;
		
		s1 = 12;
		s2 = 15;
		
		if(s1<s2) {
			System.out.println("10. Площадь первого круга меньше.");
		} else if (s2<s1) {
			System.out.println("10. Площадь второго круга меньше.");
		} else {
			System.out.println("10. Площади обоих кругов одинаковы.");		
		}
		
	}

}
