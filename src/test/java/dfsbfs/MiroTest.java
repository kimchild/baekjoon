package dfsbfs;

import java.util.Stack;

import org.junit.jupiter.api.Test;

public class MiroTest {

	static Stack<String> stack = new Stack<>();

	class Position {
		int x;
		int y;
		int dx;
		int dy;

		public Position(int x, int y, int[][] miro) {
			this.x = x;
			this.y = y;
			miro[y][x] = -1;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public int getDx() {
			return dx;
		}

		public void setDx(int dx) {
			this.dx = dx;
		}

		public int getDy() {
			return dy;
		}

		public void setDy(int dy) {
			this.dy = dy;
		}

		public void setMove(int[][] miro) {
			this.x = x + this.dx;
			this.y = y + this.dy;
			miro[y][x] = -1;
		}
	}

	static void Bfs(int[][] miro, Position position) {
		int[] dx = {1, 0, 0, -1};
		int[] dy = {0, -1, 1, 0};

		for (int i = 0; i < 4; i++) {
			position.setDx(dx[i]);
			position.setDy(dy[i]);
			if (isMoved(miro, position.getX() + position.getDx(), position.getY() + position.getDy())) {
				String strPosition = (position.getX() + position.getDx()) + " " + (position.getY() + position.getDy());
				stack.add(strPosition);
				position.setMove(miro);
				break;
			}

			if (i == 3) {
				stack.pop();
				String[] splitPosition = stack.peek().split(" ");
				int tempDx = Integer.parseInt(splitPosition[0]);
				int tempDy = Integer.parseInt(splitPosition[1]);
				position.setY(tempDy);
				position.setX(tempDx);
				i = 0;
			}
		}
		if (!isFinish(miro, position)) {
			Bfs(miro, position);
		}
	}

	private static boolean isMoved(int[][] miro, int directionX, int directionY) {
		if (directionX >= miro[0].length || directionY >= miro.length) {
			return false;
		}
		return directionX != -1 && directionY != -1 && miro[directionY][directionX] == 1;
	}

	private static boolean isFinish(int[][] miro, Position position) {
		return miro.length-1 == position.getY() && miro[0].length-1 == position.getX();
	}

	@Test
	public void dfsbfs_미로찾기() {

		String strFindTarget = "4 6";
		int x = Integer.parseInt(strFindTarget.split(" ")[0]);
		int y = Integer.parseInt(strFindTarget.split(" ")[1]);

		int result;
		/*/
		int[][] miro = {
			  {1, 0, 1, 1, 1, 1}
			, {1, 0, 1, 0, 1, 0}
			, {1, 0, 1, 0, 1, 1}
			, {1, 1, 1, 0, 1, 1}
		};
		int answer = 15;
		/**/
		/*/
		int[][] miro = {
			  {1, 1, 0, 1, 1, 0}
			, {1, 1, 0, 1, 1, 0}
			, {1, 1, 1, 1, 1, 1}
			, {1, 1, 1, 1, 0, 1}
		};
		int answer = 9;
		/**/
		/**/
		int[][] miro = {
			  {1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1 ,1, 0, 1, 1, 1}
			, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0 ,1, 1, 1, 0, 1}
		};
		int answer = 38;
		/**/
		/*/
		int[][] miro = {
			  {1, 0, 1, 1, 1, 1, 1}
			, {1, 1, 1, 0, 0, 0, 1}
			, {1, 0, 0, 0, 0, 0, 1}
			, {1, 0, 0, 0, 0, 0, 1}
			, {1, 0, 0, 0, 0, 0, 1}
			, {1, 0, 0, 0, 0, 0, 1}
			, {1, 1, 1, 1, 1, 1, 1}
		};
		int answer = 13;
		/**/

		Position position = new Position(0, 0, miro);
		Bfs(miro, position);
		result = stack.size()+1;

		System.out.println("result : " + result);
		System.out.println("answer : " + answer);
		assert result == answer;
	}

}
