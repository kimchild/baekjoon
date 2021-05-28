import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		//input
		Scanner scanner = new Scanner(System.in);

		String[] splitScanner = scanner.nextLine().split(" ");
		int fixMoney = Integer.parseInt(splitScanner[0]);
		int createPrice = Integer.parseInt(splitScanner[1]);
		int salePrice = Integer.parseInt(splitScanner[2]);

		//logic
		int answer = 0;
		if(createPrice >= salePrice) {
			answer = -1;
		} else {
			while (fixMoney >= 0) {
				fixMoney -= (salePrice - createPrice);
				answer++;
			}
		}

		//output
		System.out.println(answer);
		System.exit(0);
	}
}
