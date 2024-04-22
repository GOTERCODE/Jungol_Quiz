package q600;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String st = sc.nextLine();
		sc.close();

		String[] arr = st.split(" ");

		for (int i = 0; i < arr.length; i++) {
			
			if (i+1 == arr.length) {
				System.out.println(i+1);
			}
		}

	}

}

/*
 * 공백을 포함한 100글자 이하의 문자열을 입력받아 문장을 이루는 단어의 개수를 출력하는 프로그램을 작성하시오.
 */