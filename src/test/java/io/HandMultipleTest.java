package io;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class HandMultipleTest {
	@Test
	public void 곱셈() {
		int target = 472;
		List<Integer> numbers = getArray("385");

		int a = numbers.get(0);
		int b = numbers.get(1);
		int c = numbers.get(2);

		int result = target * c;
		assert result == 2360;

		result = target * b;
		assert result == 3776;

		result = target * a;
		assert result == 1416;

		result = (target * (a * 100)) + (target * (b * 10)) + (target * c);
		assert result == 181720;
	}

	private List<Integer> getArray(String strMinus) {
		List<Integer> list = new LinkedList<>();
		list.add(Integer.valueOf(strMinus.substring(0, 1)));
		list.add(Integer.valueOf(strMinus.substring(1, 2)));
		list.add(Integer.valueOf(strMinus.substring(2, 3)));
		return list;
	}

}
