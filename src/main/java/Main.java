import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int len = Integer.parseInt(scanner.nextLine());

		List<String> dataArr = new ArrayList<>();
		for (int i = 0; i < len; i++) {
			dataArr.add(scanner.nextLine());
		}

		StringBuilder sb = new StringBuilder();
		if (dataArr.size() < 1) {
			return;
		}
		String findStr = dataArr.get(0);
		boolean isFind = false;
		for (int i = 0; i < findStr.length(); i++) {

			String indexStr = findStr.substring(i, i+1);

			for (String s : dataArr) {

				if (!(indexStr.charAt(0) == s.substring(i, i+1).charAt(0))) {
					isFind = true;
					break;
				}

			}

			sb.append(isFind ? "?" : indexStr);
			isFind = false;
		}

		System.out.println(sb);

		System.exit(0);
	}

}
