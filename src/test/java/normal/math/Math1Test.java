package normal.math;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Math1Test {

	@Test
	void test() {

		int answer = 0;

		/*/
		int fixMoney = 1000;
		int createPrice = 70;
		int salePrice = 170;
		int answerEqualsTo = 11;
		/**/

		/*/
		int fixMoney = 3;
		int createPrice = 2;
		int salePrice = 1;
		int answerEqualsTo = -1;
		/**/

		/**/
		int fixMoney = 2100000000;
		int createPrice = 9;
		int salePrice = 10;
		int answerEqualsTo = 2100000001;
		/**/


		answer = getBreakEvenPoint(answer, fixMoney, createPrice, salePrice);
		if(createPrice >= salePrice) {
			answer = -1;
		}
		assertThat(answer).isEqualTo(answerEqualsTo);
	}

	private int getBreakEvenPoint(int answer, int fixMoney, int createPrice, int salePrice) {
		while (fixMoney >= 0) {
			fixMoney -= (salePrice - createPrice);
			answer++;
		}
		return answer;
	}
}
