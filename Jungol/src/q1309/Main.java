package q1309;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 재귀함수 사용 X
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		sc.close();
		long result = n;
		for (int i = n; i > 0; i--) {

			if (i - 1 != 0) {
				System.out.println(i + "!" + " = " + i + " * " + (i - 1) + "!");
				arr[i - 1] = i;
			} else if (i - 1 == 0) {
				System.out.println(i + "!" + " = " + i);
				arr[i - 1] = i;
			}
		}

		for (int i = n - 2; i > 0; i--) {
			result *= arr[i];
		}
		System.out.println(result);
	}

}
