package q1071;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();

		int[] arr = new int[tc];

		for (int i = 0; i < tc; i++) {
			arr[i] = sc.nextInt();
		}

		int inp = sc.nextInt();

		sc.close();
		
		int a = 0;
		int b = 0;

		for (int i = 0; i < tc; i++) {
			if (inp >= arr[i] && inp % arr[i] == 0) {
				a += arr[i];
			}

			if (arr[i] >= inp && arr[i] % inp == 0) {
				b += arr[i];
			}

		}
		
		System.out.println(a);
		System.out.println(b);

	}

}
