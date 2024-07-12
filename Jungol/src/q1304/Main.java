package q1304;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int arr[][] = new int[n][n];
		int num = 1; // 배열에 들어갈 숫자
		for (int i = 0; i < n; i++) { // 입력에서 수열을 세로순으로 입력

			for (int j = 0; j < n; j++) {

				arr[j][i] = num;
				num++;
			}

		}

		for (int i = 0; i < n; i++) { // 출력에서 수열을 가로순으로 출력

			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");

				if ((j + 1) % n == 0) { // 줄바꿈 처리
					System.out.println();
				}

			}

		}

	}

}
