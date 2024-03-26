package q594;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {					// 문자열을 입력받은 뒤 그 문자열을 이어서 두 번 출력하는 프로그램을 작성하시오. 문자열의 길이는 100이하이다.
		Scanner strInp = new Scanner(System.in);				// 입력값 heap 데이터 할당
		String str = strInp.nextLine();							// [stack] str = [heap] strInp
		strInp.close();
		System.out.println(str + str);

	}
}