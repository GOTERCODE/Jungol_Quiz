package q1309;

import java.util.Scanner;

public class Main2 { // 재귀함수 알아보면서 작성(아직 다 이해 안됨)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		long result = function(n);
		System.out.println(result);
	}

	public static long function(int n) {
		long result = 0;
		if (n == 1) {
			System.out.println(n + "!" + " = " + n);
			return n;
		} else {
			System.out.println(n + "!" + " = " + n + " * " + (n - 1) + "!");
			result = n * function(n - 1);

			return (result);

		}

	}

}