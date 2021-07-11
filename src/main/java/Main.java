import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> divided = getDividedArray(scanner.nextLine());
		double answer = getDividedNumber(divided);
		System.out.println(answer);
		System.exit(0);
	}

	private static double getDividedNumber(List<String> divided) {
		double result = Integer.parseInt(divided.get(0));
		for (String s : divided.subList(1, divided.size())) {
			result /= Double.parseDouble(s);
		}
		return result;
	}

	private static List<String> getDividedArray(String strDivided) {
		return new ArrayList<>(Arrays.asList(strDivided.split(" ")));
	}
}
