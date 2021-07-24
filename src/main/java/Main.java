import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> numbers = getArray(scanner.nextLine());
		int answer = getSumNumber(numbers);
		System.out.println(answer);

		answer = getMinusNumber(numbers);
		System.out.println(answer);

		answer = getMultipleNumber(numbers);
		System.out.println(answer);

		answer = getDividedNumber(numbers);
		System.out.println(answer);

		answer = getRestNumber(numbers);
		System.out.println(answer);
		System.exit(0);
	}

	private static List<String> getArray(String strMinus) {
		return new ArrayList<>(Arrays.asList(strMinus.split(" ")));
	}

	private static int getSumNumber(List<String> minus) {
		int result = Integer.parseInt(minus.get(0));
		for (String s : minus.subList(1, minus.size())) {
			result += Integer.parseInt(s);
		}
		return result;
	}

	private static int getMinusNumber(List<String> minus) {
		int result = Integer.parseInt(minus.get(0));
		for (String s : minus.subList(1, minus.size())) {
			result -= Integer.parseInt(s);
		}
		return result;
	}

	private static int getMultipleNumber(List<String> minus) {
		int result = Integer.parseInt(minus.get(0));
		for (String s : minus.subList(1, minus.size())) {
			result *= Integer.parseInt(s);
		}
		return result;
	}

	private static int getDividedNumber(List<String> divided) {
		int result = Integer.parseInt(divided.get(0));
		for (String s : divided.subList(1, divided.size())) {
			result /= Integer.parseInt(s);
		}
		return result;
	}

	private static int getRestNumber(List<String> divided) {
		return Integer.parseInt(divided.get(0)) % Integer.parseInt(divided.get(1));
	}
}
