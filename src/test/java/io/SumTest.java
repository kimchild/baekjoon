package io;

import org.junit.jupiter.api.Test;

public class SumTest {
	@Test
	public void Sum() {
		// Scanner scanner = new Scanner(System.in);
		// int[] sum = getSumArray(scanner.nextLine());
		int[] sum = getSumArray("4 6");
		int result = getSumNumber(sum);
		assert result == 10;
	}

	private int getSumNumber(int[] sum) {
		int result = 0;
		for (int i : sum) {
			result += i;
		}
		return result;
	}

	private int[] getSumArray(String strSum) {
		int length = strSum.split(" ").length;
		int[] result = new int[length];
		int i = 0;
		for (String s : strSum.split(" ")) {
			result[i++] = Integer.parseInt(s);
		}

		return result;
	}
}
