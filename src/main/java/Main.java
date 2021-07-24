import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> numbers = getArray(scanner.nextLine());

		int a = Integer.parseInt(numbers.get(0));
		int b = Integer.parseInt(numbers.get(1));
		int c = Integer.parseInt(numbers.get(2));

		int answer = (a + b) % c;
		System.out.println(answer);

		answer = ((a % c) + (b % c)) % c;
		System.out.println(answer);

		answer = (a * b) % c;
		System.out.println(answer);

		answer = ((a % c) * (b % c)) % c;
		System.out.println(answer);

		System.exit(0);
	}

	private static List<String> getArray(String strMinus) {
		return new ArrayList<>(Arrays.asList(strMinus.split(" ")));
	}

}
