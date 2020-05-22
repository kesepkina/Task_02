package by.htp.task03.logic;

import java.util.Scanner;

/*Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). Вычислить
результат Z в зависимости от знака. Предусмотреть реакции на возможный неверный знак операции, а
также на ввод Y=0 при делении. Организовать возможность многократных вычислений без
перезагрузки программа (т.е. построить цикл). В качестве символа прекращения вычислений принять
‘0’.*/

public class Task28 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		double x, y, z;
		String oper, end;

		do {
			System.out.print("x: ");
			if (!sc.hasNextDouble()) {
				sc.next();
				System.out.print("x: ");
			}
			x = sc.nextDouble();
			System.out.print("y: ");
			if (!sc.hasNextDouble()) {
				sc.next();
				System.out.print("y: ");
			}
			y = sc.nextDouble();
			System.out.print("Operation: ");
			oper = sc.next();
			while (!(oper.equals("+") || oper.equals("-") || oper.equals("*") || oper.equals("/"))) {
				System.out.println("I don't know this operation.");
				System.out.print("Operation: ");
				oper = sc.next();
			}

			if (oper.equals("+")) {
				z = x + y;
				System.out.println(x + " + " + y + " = " + z);
			} else if (oper.equals("-")) {
				z = x - y;
				System.out.println(x + " - " + y + " = " + z);
			} else if (oper.equals("*")) {
				z = x * y;
				System.out.println(x + " * " + y + " = " + z);
			} else if (oper.equals("/")) {
				z = x / y;
				System.out.println(x + " / " + y + " = " + z);
			}

			System.out.println("Прекратить вычисления?");
			end = sc.next();
		} while (!end.equals("0"));
		
		System.out.println("Вычисления прекращены.");

	}

}
