import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//input
		Scanner scanner = new Scanner(System.in);

		final int findTarget = scanner.nextInt();

		//logic
		int answer = 1;
		final int addedRow = 6;
		int anchor = 1;

		while (findTarget != 1 && anchor <= findTarget) {
			anchor += (addedRow * answer);
			answer++;
		}

		//output
		System.out.println(answer);
		System.exit(0);
	}
}
