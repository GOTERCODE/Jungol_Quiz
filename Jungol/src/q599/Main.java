package q599;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		sc.close();
		String stre = st.replaceAll("[^A-z]","");

		System.out.println(stre.toUpperCase());

	}

}


/*문자열을 입력받아 알파벳 문자만 모두 대문자로 출력하는 프로그램을 작성하시오.

문자열의 길이는 100이하이다.*/