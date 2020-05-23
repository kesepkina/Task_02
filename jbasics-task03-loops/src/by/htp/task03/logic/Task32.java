package by.htp.task03.logic;

/*��������� ��������� ������������� ������ �� ������� ������������ ��������. � ��������
������� ������� ��������� ������ ����� � ���� �������������. ��������� ������� ����� ����
�������, ������� � ������ �������������.*/

public class Task32 {

	public static void main(String[] args) {

		String user;
		char sym;

		user = "_wer67\n";

		sym = user.charAt(0);

		if (!(sym == '_' || (sym > 64 && sym < 91) || (sym > 96 && sym < 123))) {
			System.out.println(
					"������� ��������� ������. � �������� ������� ������� ��������� ������ ����� � ���� �������������.");
			return;
		}

		sym = user.charAt(1);

		int i = 1;

		while (sym != '\n') {
			if (!(sym == '_' || (sym > 64 && sym < 91) || (sym > 96 && sym < 123) || (sym > 47 && sym < 58))) {
				System.out.println(
						"������� ��������� ������. ��� �������, ������� �� �������, ����� ���� ������ �������, ������� � ������ �������������.");
				return;
			}
			sym = user.charAt(++i);
		}

		System.out.println("������ ������� �����.");

	}

}
