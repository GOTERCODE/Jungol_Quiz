package q1304;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n * n];

		for (int i = 0; i < n * n; i++) {
			arr[i] = i + 1;
		}

		sc.close();

		int idx = 0;

		for (int i = 0; i < n * n; i++) {

			if (i == 0 && i % n - 1 == 0) {
				System.out.print(arr[i] + " ");
				idx += n;
			} else {
				System.out.print(arr[idx] + " ");
				idx += n;
			}

			if ((i + 1) % n == 0) {
				System.out.println();
			}
			idx = i;
		}

	}

}
