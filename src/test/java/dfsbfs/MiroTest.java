package dfsbfs;

import org.junit.jupiter.api.Test;

public class MiroTest {

	private boolean isGoal(int i, int j, int x, int y) {
		return i == x && j == y;
	}
	private boolean isWorking(int i, int j, int[][] miro) {
		return (miro[i][j] == 1);
	}

	@Test
	public void dfsbfs_미로찾기() {
		String strFindTarget = "4 6";
		int x = Integer.parseInt(strFindTarget.split(" ")[0]);
		int y = Integer.parseInt(strFindTarget.split(" ")[1]);

		int[][] miro =   {
							  {1,0,1,1,1,1}
							, {1,0,1,0,1,0}
							, {1,0,1,0,1,1}
							, {1,1,1,0,1,1}
		};

		int result = 0;
		int answer = 15;
		int[] dx = {0, 1, 0, -1};
		int[] dy = {1, 0, -1, 0};

		// outerloop:
		

		System.out.println("result : " + result);
		System.out.println("answer : " + answer);
		assert result == answer;
	}

}
