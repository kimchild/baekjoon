import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> multiple = getMultipleArray(scanner.nextLine());
		int answer = getMultipleNumber(multiple);
		System.out.println(answer);
		System.exit(0);
	}

	private static int getMultipleNumber(List<String> multiple) {
		int result = Integer.parseInt(multiple.get(0));
		for (String s : multiple.subList(1, multiple.size())) {
			result *= Integer.parseInt(s);
		}
		return result;
	}

	private static List<String> getMultipleArray(String strMultiple) {
		return new ArrayList<>(Arrays.asList(strMultiple.split(" ")));
	}
}
