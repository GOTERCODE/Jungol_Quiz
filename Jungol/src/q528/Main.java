package q528; //정수를 입력받아 첫 줄에 입력 받은 숫자를 출력하고 둘째 줄에 음수이면 “minus” 라고 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sci = new Scanner(System.in);
		int i1 = sci.nextInt();

		sci.close();

		if (i1 >= 0) {
			System.out.println(i1);
		} else {
			System.out.println(i1 + "\n" + "minus");
		}
	}
}
