package q597;	//두 개의 문자열을 입력받아서 두 문자열의 길이의 합을 출력하는 프로그램을 작성하시오. 각 문자열의 길이는 20자 미만이다.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		String st2 = sc.next();
		sc.close();
		
		int i = st.length();
		int j = st2.length();
		
		System.out.println(i+j);
		

	}

}
