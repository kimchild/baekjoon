package io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class MultipleTest {
	@Test
	public void Multiple() {
		// Scanner scanner = new Scanner(System.in);
		// int[] multiple = getMultipleArray(scanner.nextLine());
		List<String> multiple = getMultipleArray("6 4");
		int result = getMultipleNumber(multiple);
		assert result == 24;
	}

	private int getMultipleNumber(List<String> multiple) {
		int result = Integer.parseInt(multiple.get(0));
		for (String s : multiple.subList(1, multiple.size())) {
			result *= Integer.parseInt(s);
		}
		return result;
	}

	private List<String> getMultipleArray(String strMultiple) {
		return new ArrayList<>(Arrays.asList(strMultiple.split(" ")));
	}
}
