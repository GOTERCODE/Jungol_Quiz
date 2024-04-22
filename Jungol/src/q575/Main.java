package q575;

import java.util.Scanner;

public class Main {

	public static int N(int n1, int n2) {
		int result = 1;

		for (int i = 0; i < n2; i++) {
			result *= n1;

		}
		return result;
	}

	public static void main(String[] args) {
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		sc.close();
		int result = N(n1, n2);
		System.out.println(result);
	}

}

/*
 * 10 이하의 두 정수가 주어진다.
 * 
 * 이를 입력 받아서 첫 번째 수를 두 번째 수만큼 거듭제곱하여 나온 값을 리턴하는 함수를 작성하여 
 * 
 * 다음과 같이 출력하는 프로그램을 작성하시오.
 */