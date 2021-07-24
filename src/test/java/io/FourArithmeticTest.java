package io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FourArithmeticTest {
	@Test
	public void 사친연산() {
		List<String> numbers = getArray("7 3");
		int result = getSumNumber(numbers);
		assert result == 10;

		result = getMinusNumber(numbers);
		assert result == 4;

		result = getMultipleNumber(numbers);
		assert result == 21;

		result = getDividedNumber(numbers);
		assert result == 2;

		result = getRestNumber(numbers);
		assert result == 1;

	}

	private List<String> getArray(String strMinus) {
		return new ArrayList<>(Arrays.asList(strMinus.split(" ")));
	}

	private int getSumNumber(List<String> minus) {
		int result = Integer.parseInt(minus.get(0));
		for (String s : minus.subList(1, minus.size())) {
			result += Integer.parseInt(s);
		}
		return result;
	}

	private int getMinusNumber(List<String> minus) {
		int result = Integer.parseInt(minus.get(0));
		for (String s : minus.subList(1, minus.size())) {
			result -= Integer.parseInt(s);
		}
		return result;
	}

	private int getMultipleNumber(List<String> minus) {
		int result = Integer.parseInt(minus.get(0));
		for (String s : minus.subList(1, minus.size())) {
			result *= Integer.parseInt(s);
		}
		return result;
	}

	private int getDividedNumber(List<String> divided) {
		int result = Integer.parseInt(divided.get(0));
		for (String s : divided.subList(1, divided.size())) {
			result /= Integer.parseInt(s);
		}
		return result;
	}

	private int getRestNumber(List<String> divided) {
		return Integer.parseInt(divided.get(0)) % Integer.parseInt(divided.get(1));
	}

}
