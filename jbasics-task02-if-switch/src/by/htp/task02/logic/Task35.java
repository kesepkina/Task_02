package by.htp.task02.logic;

// Вычислить число и месяц в невисокосном году по номеру дня.

public class Task35 {

	public static void task() {

		int day, date, month;

		day = 257;
		date = 0;
		month = 0;

		if (day > 0 && day < 32) {
			date = day;
			month = 1;
		} else if (day > 31 && day < 60) {
			date = day - 31;
			month = 2;
		} else if (day > 59 && day < 91) {
			date = day - 59;
			month = 3;
		} else if (day > 90 && day < 121) {
			date = day - 90;
			month = 4;
		} else if (day > 120 && day < 152) {
			date = day - 120;
			month = 5;
		} else if (day > 151 && day < 182) {
			date = day - 151;
			month = 6;
		} else if (day > 181 && day < 213) {
			date = day - 181;
			month = 7;
		} else if (day > 212 && day < 244) {
			date = day - 212;
			month = 8;
		} else if (day > 243 && day < 275) {
			date = day - 243;
			month = 9;
		} else if (day > 274 && day < 305) {
			date = day - 274;
			month = 10;
		} else if (day > 304 && day < 336) {
			date = day - 304;
			month = 11;
		} else if (day > 335 && day < 366) {
			date = day - 335;
			month = 12;
		} else {
			System.out.println("35. This day doesn't exist.");
		}

		System.out.println("35. Today is " + date + "." + month + " .");
	}

}
