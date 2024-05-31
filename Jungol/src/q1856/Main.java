package q1856;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		int[][] arr = new int[n][m];

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < m; j++) {
				int Assignment = j + 1; 			// 대입값 변수 선언
				if (i > 0) {
					Assignment += (m * i);			// 현재 행에 따라 배열에 들어가는 값 설정
				}
				arr[i][j] = Assignment;

			}
		}

		for (int i = 0; i < n; i++) {			 	// 행에 따라 배열의 저장된 값의 출력순서를 변경

			if ((i + 1) % 2 == 0) {					// 짝수행 역방향 출력
				for (int k = m - 1; k >= 0; k--) {
					System.out.print(arr[i][k] + " ");
				}
				
			} else {								// 홀수행 정방향 출력
				for (int j = 0; j < m; j++) {
					System.out.print(arr[i][j] + " ");

				}
			}
			System.out.println();
		}

	}
}