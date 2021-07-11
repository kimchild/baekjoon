package io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class MinusTest {
	@Test
	public void Minus() {
		// Scanner scanner = new Scanner(System.in);
		// int[] minus = getMinusArray(scanner.nextLine());
		List<String> minus = getMinusArray("6 4");
		int result = getMinusNumber(minus);
		assert result == 2;
	}

	private int getMinusNumber(List<String> minus) {
		int result = Integer.parseInt(minus.get(0));
		for (String s : minus.subList(1, minus.size())) {
			result -= Integer.parseInt(s);
		}
		return result;
	}

	private List<String> getMinusArray(String strMinus) {
		return new ArrayList<>(Arrays.asList(strMinus.split(" ")));
	}
}
