package q577;

import java.util.Scanner;

public class Main {

	public String Calc(int n1, int n2) {

		int result1 = 0;
		int result2 = 0;

		if (n2 > n1) {
			result1 = n1 * 2;
			result2 = n2 / 2;
		} else {
			result1 = n1 / 2;
			result2 = n2 * 2;
		}
		String result = result1 + " " + result2;

		return result;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		Main main = new Main();
		String result = main.Calc(n1, n2);
		System.out.println(result);

	}

}
