package io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class DividedTest {
	@Test
	public void Divided() {
		// Scanner scanner = new Scanner(System.in);
		// int[] divided = getDividedArray(scanner.nextLine());
		List<String> divided = getDividedArray("1 3");
		double result = getDividedNumber(divided);
		assert result == 0.33333333333333333333333333333333;
	}

	private double getDividedNumber(List<String> divided) {
		double result = Integer.parseInt(divided.get(0));
		for (String s : divided.subList(1, divided.size())) {
			result /= Double.parseDouble(s);
		}
		return result;
	}

	private List<String> getDividedArray(String strDivided) {
		return new ArrayList<>(Arrays.asList(strDivided.split(" ")));
	}
}
