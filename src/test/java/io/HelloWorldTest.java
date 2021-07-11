package io;

import org.junit.jupiter.api.Test;

public class HelloWorldTest {
	@Test
	public void HelloWorld() {
		String answer = "Hello World!";
		assert "Hello World!".equals(answer);
	}
}
