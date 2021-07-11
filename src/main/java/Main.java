import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> minus = getMinusArray(scanner.nextLine());
		int answer = getMinusNumber(minus);
		System.out.println(answer);
		System.exit(0);
	}

	private static int getMinusNumber(List<String> minus) {
		int result = Integer.parseInt(minus.get(0));
		for (String s : minus.subList(1, minus.size())) {
			result -= Integer.parseInt(s);
		}
		return result;
	}

	private static List<String> getMinusArray(String strMinus) {
		return new ArrayList<>(Arrays.asList(strMinus.split(" ")));
	}
}
