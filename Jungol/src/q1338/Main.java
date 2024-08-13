package q1338;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		char[][] arr = new char[n][n];

		char ch = 65;
		int chcnt = n - 1;

		for (int i = 0; i < n; i++) {

			if (ch > 90) {
				ch = 65;
			}

			arr[i][chcnt] = ch;
			ch++;
			
			
			chcnt--;
		}

	}

}
