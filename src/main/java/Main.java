import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int target = Integer.parseInt(scanner.nextLine());
		List<Integer> numbers = getArray(scanner.nextLine());

		int a = numbers.get(0);
		int b = numbers.get(1);
		int c = numbers.get(2);

		int answer = target * c;
		System.out.println(answer);

		answer = target * b;
		System.out.println(answer);

		answer = target * a;
		System.out.println(answer);

		answer = (target * (a * 100)) + (target * (b * 10)) + (target * c);
		System.out.println(answer);

		System.exit(0);
	}

	private static List<Integer> getArray(String strMinus) {
		List<Integer> list = new LinkedList<>();
		list.add(Integer.valueOf(strMinus.substring(0, 1)));
		list.add(Integer.valueOf(strMinus.substring(1, 2)));
		list.add(Integer.valueOf(strMinus.substring(2, 3)));
		return list;
	}

}
