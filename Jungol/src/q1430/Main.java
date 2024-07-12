package q1430;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		int result = A * B * C;
		String resStr = result + ""; // 한 글자씩 비교하기위해 String으로 선언
		int[] NumCnt = new int[10];

		for (int i = 0; i < resStr.length(); i++) {
			for (int j = 0; j < 10; j++) {

				if (resStr.charAt(i) - 48 == j) {
					NumCnt[j]++;
				}
			}
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(NumCnt[i]);
		}

	}

}
