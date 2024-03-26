package q559; //1반부터 6반까지의 평균점수를 저장한 후 두 반의 반 번호를 입력받아 두 반 평균점수의 합을 출력하는 프로그램을 작성하시오.

//반별 평균점수는 초기값으로 1반부터 차례로 85.6 79.5 83.1 80.0 78.2 75.0으로 초기화하고 출력은 소수 두 번째 자리에서 반올림하여 소수 첫째자리까지 한다.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cls = new Scanner(System.in);
		double[] scores = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 }; // 더블타입 score 변수에 점수를 배열선언과 동시에 초기화
		int cls1 = cls.nextInt(); // 첫번째 반 입렵
		int cls2 = cls.nextInt(); // 두번째 반 입력

		cls.close();

		double sum = scores[cls1 - 1] + scores[cls2 - 1]; // scores에 할당된 평균점수의 인덱스 값은 입력된 정수(반)에서 -1이다 | 해당 인덱스에 할당된 값을
															// 더하는 변수

		System.out.println(sum); // 연산된 값을 출력한다
	}

}
