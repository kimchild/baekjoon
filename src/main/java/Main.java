import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] sum = getSumArray(scanner.nextLine());
		int answer = getSumNumber(sum);
		System.out.println(answer);
		System.exit(0);
	}

	private static int getSumNumber(int[] sum) {
		int result = 0;
		for (int i : sum) {
			result += i;
		}
		return result;
	}

	private static int[] getSumArray(String strSum) {
		int length = strSum.split(" ").length;
		int[] result = new int[length];
		int i = 0;
		for (String s : strSum.split(" ")) {
			result[i++] = Integer.parseInt(s);
		}

		return result;
	}
}
