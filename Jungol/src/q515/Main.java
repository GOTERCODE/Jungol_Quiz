package q515;

import java.util.Scanner;		//Scanner class = 사용자 입력

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();	//첫번째 수식 사용자 입력 변수 선언
		int b = sc.nextInt();
		
		sc.close();
		
		int c = a * b;		// 변수 c(첫번째 수식 답) 선언
		int d = a / b;
		
		System.out.println(a + " * " + b + " = " + c);
		System.out.println(a + " / " + b + " = " + d);
		//--------------------------------------------------- 내가 해본 비효율적인 방법 _ 결과값(c,d) 변수 선언
		System.out.println(a + " * " + b + " = " + (a * b));
		System.out.println(a + " * " + b + " = " + (a / b));
		//--------------------------------------------------- 결과값(c,d) 출력문 자체에 수식 설정
		System.out.printf("%d * %d = %d\n", a, b, a * b);
		System.out.printf("%d / %d = %d\n", a, b, a / b);
		//--------------------------------------------------- 결과값(c,d) 문자열 출력 형식 설정
	}
}