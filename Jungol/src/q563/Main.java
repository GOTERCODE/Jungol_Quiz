package q563;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[10];

		for (int i = 0; i < 10; i++) {
			n[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(n);

		for (int i = 9; i >= 0; i--) {
			System.out.print(n[i] + " ");
		}

	}

}
