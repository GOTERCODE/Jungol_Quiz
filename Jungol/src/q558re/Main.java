package q558re;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] ar = new int[100];
		int idx = 0;

		while (true) {
			ar[idx] = sc.nextInt();
			if (ar[idx] == 0) {
				break;
			}

			idx++;

		}
		sc.close();

		for (int i = idx - 1; i >= 0; i--) {
			System.out.print(ar[i] + " "); 			
													//	마지막으로 입력된 값 0은 제외해야 하므로 idx - 1 조건을 부여하여 마지막으로 입력된 인덱스의 바로 앞부터 출력하도록 한다
		}											//	그 다음 입력값 출력을 위해 i 변수는 위에서 입력된 만큼 증가하도록 한 idx 변수값에서 감산을 한다

	}
}
