package q533;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int a = sc.nextInt();


		sc.close();
		
		if (s.equals("M")) {			////String type 비교연산자
			if (a >= 18) {
				System.out.println("MAN");
			} else if (a < 18) {
				System.out.println("BOY");
			}

		} 
		

		if (s.equals("F")) {	  		//String type 비교연산자
			if (a >= 18) {
				System.out.println("WOMAN");
			} else if (a < 18){
				System.out.println("GIRL");
			}
		}
	}

}

/*
 * 남자는 'M' 여자는 'F'로 나타내기로 하고 18세 이상을 성인이라고 하자.
 * 
 * 성별('M', 'F')과 나이를 입력받아 "MAN"(성인남자), "WOMAN"(성인여자), "BOY"(미성년남자),
 * "GIRL"(미성년여자)을 구분하여 출력하는 프로그램을 작성하시오
 */

