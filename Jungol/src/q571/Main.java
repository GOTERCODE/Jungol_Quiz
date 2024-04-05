package q571; //문자열 "~!@#$^&*()_+|" 를 출력하는 함수를 작성하고 정수를 입력받아 입력받은 수만큼 함수를 호출하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Main {
	public static void printStr() {

		System.out.println("~!@#$^&*()_+|");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i;
		for (i = sc.nextInt(); i > 0; i--) {
			printStr();
			sc.close();
		}

	}

}
