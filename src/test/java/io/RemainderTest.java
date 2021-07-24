package io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class RemainderTest {
	@Test
	public void 나머지() {
		// (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
		// (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
		// 첫째 줄에 (A+B)%C
		// 둘째 줄에 ((A%C) + (B%C))%C
		// 셋째 줄에 (A×B)%C
		// 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
		List<String> numbers = getArray("5 8 4");

		int a = Integer.parseInt(numbers.get(0));
		int b = Integer.parseInt(numbers.get(1));
		int c = Integer.parseInt(numbers.get(2));

		int result = (a + b) % c;
		assert result == 1;

		result = ((a % c) + (b % c)) % c;
		assert result == 1;

		result = (a * b) % c;
		assert result == 0;

		result = ((a % c) * (b % c)) % c;
		assert result == 0;

	}

	private List<String> getArray(String strMinus) {
		return new ArrayList<>(Arrays.asList(strMinus.split(" ")));
	}

}
