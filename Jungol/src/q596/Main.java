package q596;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		int in = sc.nextInt();
		sc.close();

		int le = st.length();

		char[] ch = st.toCharArray();
		int idx;

		if (in > le) {
			for (idx=in-le; idx > le; idx--) {
				System.out.print(ch[idx]);
			}
		} else {
			for (idx = le-1; in > 0; in--) {
				System.out.print(ch[idx]);
				idx--;
			}
		}
	}
}

/*
 * 문자열을 입력받고 정수를 입력 받아서 문자열의 맨 뒤부터 정수만큼 출력하는 프로그램을 작성하시오.
 * 
 *  만약 입력받은 정수가 문자열의 길이보다 크다면 맨 뒤부터 맨 처음까지 모두 출력한다.
 * 
 * (문자열 길이는 최대 100자 이하이다. )
 */
