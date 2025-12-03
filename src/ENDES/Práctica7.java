package ENDES;

public class Práctica7 {
	public static void main(String[] args) {
		new Práctica7().exc1();
	}

	void exc1() {
		// Calcula el resultado de las siguientes expresiones:

		int result1, result2;
		boolean result3, result4, result5;

		// Ejer 1
		result1 = 3 * 5 - 4 / 2;

		// Ejer 2
		result2 = 7 - 4 * 2 - 5 * 2;

		// Ejer 3
		result3 = 5 + 4 < 7 + 8;
		// Ejer 4
		result4 = 4 < 5 * 4 / 2 - 7;


		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

	}
}