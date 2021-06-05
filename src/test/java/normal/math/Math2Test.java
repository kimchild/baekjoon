package normal.math;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Math2Test {

	@Test
	void test() {

		int answer = 1;

		/*/
		final int findTarget = 13;
		final int result = 3;
		/**/
		/*/
		final int findTarget = 58;
		final int result = 5;
		/**/
		/**/
		final int findTarget = 69;
		final int result = 6;
		/**/

		// final int root = 1;
		final int addedRow = 6;
		int anchor = 1;


		while (findTarget != 1 && anchor <= findTarget) {
			System.out.println("answer : " + answer);
			System.out.println("anchor : " + anchor);
			anchor += (addedRow * answer);
			answer++;
		}

		assertThat(answer).isEqualTo(result);
	}
}
