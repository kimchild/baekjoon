package bronze;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class OrderPrompt {

	@Test
	public void 명령_프롬프트() {

		String[] arr = {"3"
						, "config.sys"
						, "config.inf"
						, "configures"};

		// String[] dataArr = {"2"
		// 				, "contest.txt"
		// 				, "context.txt"};

		// String[] dataArr = {"3"
		// 	, "c.user.mike.programs"
		// 	, "c.user.nike.programs"
		// 	, "c.user.rice.programs"};

		// String[] dataArr = {"4"
		// 	, "a"
		// 	, "a"
		// 	, "b"
		// 	, "b"};

		// String[] dataArr = {"1"
		// 	, "onlyonefile"};

		int len = Integer.parseInt(arr[0]);

		List<String> dataArr = new ArrayList<>();
		dataArr.addAll(Arrays.asList(arr).subList(1, len + 1));

		// Collections.sort(dataArr, Comparator.comparingInt(String::length));

		StringBuilder sb = new StringBuilder();
		String findStr = dataArr.get(1);
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

		assert true;
	}
}
