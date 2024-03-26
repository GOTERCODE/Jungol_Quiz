package q558;//100 개의 정수를 저장할 수 있는 배열을 선언하고 정수를 차례로 입력받다가 0 이 입력되면 0 을 제외하고 

//그 때까지 입력된 정수를 가장 나중에 입력된 정수부터 차례대로 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] intA = new int[100];
		Scanner sc = new Scanner(System.in);

		int intInp = sc.nextInt();
		sc.close();

		if (intInp == 0) {
			break;
		} else {
			intA[100] = intInp;

		}
		for(

	int (i = 100 - 1;i>=0;i--)
	

		System.out.println(intA);

	}
}

