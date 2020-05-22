package by.htp.task03.logic;

import java.math.BigInteger;

// ��������� ��������� ���������� ������������ ��������� ������ ������� �����.

public class Task10 {

	public static void main(String[] args) {

		BigInteger mul = BigInteger.valueOf(1);
		BigInteger max = BigInteger.valueOf(201);
		BigInteger one = BigInteger.valueOf(1);

		for (BigInteger i = BigInteger.valueOf(1); i.compareTo(max) == -1; i = i.add(one)) { // 0 �� �������
			mul = mul.multiply(i.multiply(i));
		}

		System.out.println(" Multiply = " + mul);

	}

}
