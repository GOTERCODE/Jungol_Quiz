package q1840;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int cnt = 0;
		int cntSave = 0;
		int time = 0;
		int[][] arr = new int[a][b];

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				arr[i][j] = sc.nextInt();
			}

		}
		int[][] arrCopy = arr;

		while (true) {
			cnt = 0;
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < b; j++) {
					if (arr[i][j] == 1) {
						cnt++;
						cntSave = cnt;

					}

				}

			}

			for (int i = 0; i < a; i++) {
				for (int j = 0; j < b; j++) {
					if (i != 0 && i != a && j != 0 && j != b) {
						if (arr[i - 1][j] == 0 || arr[i + 1][j] == 0 || arr[i][j - 1] == 0 || arr[i][j + 1] == 0) {
							arrCopy[i][j] = 0;
						}
					}
				}

			}
			time++;

			arr = arrCopy;

			if (cnt == 0) {
				System.out.println(time);
				System.out.println(cntSave);
				break;
			}

		}

	}

}
