package by.htp.task03.logic;

/*Проверить введенную пользователем строку на наличие недопустимых символов. В качестве
первого символа допустимы только буквы и знак подчеркивания. Остальные символы могут быть
буквами, цифрами и знаком подчеркивания.*/

public class Task32 {

	public static void main(String[] args) {

		String user;
		char sym;

		user = "_wer67\n";

		sym = user.charAt(0);

		if (!(sym == '_' || (sym > 64 && sym < 91) || (sym > 96 && sym < 123))) {
			System.out.println(
					"Неверно введенная строка. В качестве первого символа допустимы только буквы и знак подчеркивания.");
			return;
		}

		sym = user.charAt(1);

		int i = 1;

		while (sym != '\n') {
			if (!(sym == '_' || (sym > 64 && sym < 91) || (sym > 96 && sym < 123) || (sym > 47 && sym < 58))) {
				System.out.println(
						"Неверно введенная строка. Все символы, начиная со второго, могут быть только буквами, цифрами и знаком подчеркивания.");
				return;
			}
			sym = user.charAt(++i);
		}

		System.out.println("Строка введена верно.");

	}

}
